package com.example.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    ImageButton calculatorImageButton;
    ImageButton historyImageButton, MusicImageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        calculatorImageButton = findViewById(R.id.calculatorImageButton);
        historyImageButton = findViewById(R.id.historyImageButton);
        MusicImageButton = findViewById(R.id.btnSTIHymn);


        calculatorImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentToGradeCalculator = new Intent(HomeActivity.this, GradeCalculator.class);
                startActivity(intentToGradeCalculator);

            }
        });


        historyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentToHistory = new Intent(HomeActivity.this, HistoryActivity.class);
                startActivity(intentToHistory);

            }
        });

        MusicImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentToMusic = new Intent(HomeActivity.this, STIHymnActivity.class);
                startActivity(intentToMusic);

            }
        });
    }

}