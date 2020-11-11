package com.example.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    ImageButton calculatorImageButton;
    ImageButton historyImageButton;
    ImageButton MusicImageButton;
    ImageButton stiWebsiteImageButton;
    ImageButton stiAdImageButton;

    TextView emailTextView;

    String emailAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent fromMain = getIntent();
        Bundle bundle = fromMain.getExtras();

        String emailAddress = (String) bundle.get("email");

        calculatorImageButton = findViewById(R.id.calculatorImageButton);
        historyImageButton = findViewById(R.id.historyImageButton);
        MusicImageButton = findViewById(R.id.btnSTIHymn);
        stiWebsiteImageButton = findViewById(R.id.stiWebsiteImageButton);
        stiAdImageButton = findViewById(R.id.stiAdImageButton);
        emailTextView = findViewById(R.id.emailTextView);


        emailTextView.setText(emailAddress);



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

        stiWebsiteImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.sti.edu/";
                Intent intentoSTIWebsite = new Intent(Intent.ACTION_VIEW);
                intentoSTIWebsite.setData(Uri.parse(url));
                startActivity(intentoSTIWebsite);

            }
        });

        stiAdImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentToSTIVideo = new Intent(HomeActivity.this, VideoActivity.class);
                startActivity(intentToSTIVideo);
            }
        });
    }

}