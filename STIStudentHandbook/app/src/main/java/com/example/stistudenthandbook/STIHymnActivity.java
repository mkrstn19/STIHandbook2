package com.example.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class STIHymnActivity extends AppCompatActivity {

    Button PlayButton;
    Button PauseButton;
    Button StopButton;

    MediaPlayer sti_hymn = null;
    int position;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_t_i_hymn);

        PlayButton = findViewById(R.id.playButton);
        PauseButton = findViewById(R.id.pauseButton);
        StopButton = findViewById(R.id.stopButton);

        PlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sti_hymn==null)
                {
                    sti_hymn = MediaPlayer.create(getApplicationContext(),R.raw.alma_mater_hymn);
                    sti_hymn.start();
                }
                else if(!sti_hymn.isPlaying())
                {
                    sti_hymn.seekTo(position);
                    sti_hymn.start();
                }
            }
        });
        PauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sti_hymn!=null)
                {
                    sti_hymn.pause();
                    position=sti_hymn.getCurrentPosition();
                }
            }
        });
        StopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sti_hymn!=null)
                {
                    sti_hymn.stop();
                    sti_hymn=null;
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        sti_hymn.stop();
        sti_hymn=null;
    }
}