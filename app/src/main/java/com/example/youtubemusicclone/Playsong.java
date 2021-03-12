package com.example.youtubemusicclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;

public class Playsong extends AppCompatActivity {
    private Button btnPlay,btnNext,btnPreview;
    private TextView tvName,tvStart,tvStop;
    private SeekBar seekMusic;
    String sname;
    public static final String EXTRA_NAME="song_name";
    static MediaPlayer mediaPlayer;
    int position;
    ArrayList<File>mySongs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playsong);
        btnPlay=findViewById(R.id.btnPlay);
        btnNext=findViewById(R.id.btnNext);
        btnPreview=findViewById(R.id.btnPreview);
        tvName=findViewById(R.id.tvtsn);
        tvStart=findViewById(R.id.tvstart);
        tvStop=findViewById(R.id.tvstop);
        seekMusic=findViewById(R.id.seekbar);
        if (mediaPlayer!=null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        mySongs=(ArrayList) bundle.getParcelableArrayList("songs");
        String songName=intent.getStringExtra("songsname");
        position=bundle.getInt("pos",0);
        tvName.setSelected(true);
        Uri uri=Uri.parse(mySongs.get(position).toString());
        sname=mySongs.get(position).getName();
        tvName.setText(sname);
        mediaPlayer=MediaPlayer.create(getApplicationContext(),uri);
        mediaPlayer.start();
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){
                    btnPlay.setBackgroundResource(R.drawable.ic_baseline_play_arrow_24);
                    mediaPlayer.pause();
                }else {
                    btnPlay.setBackgroundResource(R.drawable.ic_pause);
                    mediaPlayer.start();
                }
            }
        });



    }
}






