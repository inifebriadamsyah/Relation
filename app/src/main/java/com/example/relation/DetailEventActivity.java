package com.example.relation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

import static android.content.ContentValues.TAG;

public class DetailEventActivity extends Activity {

    private ImageButton backButton;
    private ImageButton shareButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        backButton = (ImageButton) findViewById(R.id.back_to_main);
        shareButton = (ImageButton) findViewById(R.id.sharing);

        Log.d(TAG, "onCreate: called");

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailEventActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.fade_out);
            }
        });
    }
}
