package com.example.relation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    ImageButton searchBackButton;

    private RecyclerView searchHistoryRecyclerView;
    private SearchHistoryAdapter searchHistoryAdapter;
    private ArrayList<SearchHistory> searchHistoryArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchBackButton = (ImageButton) findViewById(R.id.search_back);
        searchBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.fade_out);
            }
        });

        addData();
        searchHistoryRecyclerView = (RecyclerView) findViewById(R.id.search_history);
        searchHistoryAdapter = new SearchHistoryAdapter(searchHistoryArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SearchActivity.this);

        searchHistoryRecyclerView.setLayoutManager(layoutManager);
        searchHistoryRecyclerView.setAdapter(searchHistoryAdapter);
    }

    void addData() {
        searchHistoryArrayList = new ArrayList<>();
        searchHistoryArrayList.add(new SearchHistory("Ruang Inovator"));
        searchHistoryArrayList.add(new SearchHistory("Sebung Surabaya"));
        searchHistoryArrayList.add(new SearchHistory("Jumpup Window"));
    }
}