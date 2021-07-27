package com.example.relation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.SearchView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    MaterialCardView filterImageButton;
    MaterialCardView searchCard;
    ImageButton profileImage;

    private RecyclerView eventRecyclerView;
    private EventAdapter eventAdapter;
    private ArrayList<Event> eventArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filterImageButton = (MaterialCardView) findViewById(R.id.filterButton);
        searchCard = (MaterialCardView) findViewById(R.id.searchBar);
        profileImage = (ImageButton) findViewById(R.id.imageProfile);

        setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false);
        getWindow().setStatusBarColor(Color.TRANSPARENT);

        addData();

        eventRecyclerView = (RecyclerView) findViewById(R.id.eventRecyclerView);
        eventAdapter = new EventAdapter(eventArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        eventRecyclerView.setLayoutManager(layoutManager);

        eventRecyclerView.setAdapter(eventAdapter);

        filterImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleFilterSheet();
            }
        });

        searchCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });
    }

    public static void setWindowFlag(Activity activity, final int bits, boolean on) {////9
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

    void addData() {
        eventArrayList = new ArrayList<>();
        eventArrayList.add(new Event("Open Recruitment Anggota PPI 2021", "Peduli Pendidikan Indonesia", "February, 20 2021", "Perak, Surabaya", "Education"));
        eventArrayList.add(new Event("Relawan Nabung Bolu Surabaya", "Gerakan Peduli Kemanusian", "February, 10 2021", "Rungkut, Surabaya", "Hunger"));
        eventArrayList.add(new Event("Relawan Ruang Inovator", "MRelawan Ruang Inovator", "February, 1 2021", "Perak, Surabaya", "Education"));
        eventArrayList.add(new Event("The Trqnquility Tublerone", "Mohammed Huncho", "February, 11 2021", "Gresik, Gresik", "Hunger"));
        eventArrayList.add(new Event("We about to Paint the town", "Blockberry Creative", "February, 18 2021", "Semolowaru, Surabaya", "Education"));
    }

    public void toggleFilterSheet() {
        View bottomFilterSheet = getLayoutInflater().inflate(R.layout.filter_bottom_sheet, null);

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this, R.style.BottomSheetDialogTheme);
        bottomSheetDialog.setContentView(bottomFilterSheet);
        bottomSheetDialog.show();
    }
}

