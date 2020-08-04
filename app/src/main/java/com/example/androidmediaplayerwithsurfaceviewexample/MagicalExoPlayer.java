package com.example.androidmediaplayerwithsurfaceviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.potyvideo.library.AndExoPlayerView;

public class MagicalExoPlayer extends AppCompatActivity {


    AndExoPlayerView andExoPlayerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magical_exo_player);

        andExoPlayerView=findViewById(R.id.andExoPlayerView);
        andExoPlayerView.setSource("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4");



    }
}