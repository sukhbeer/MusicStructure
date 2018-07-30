package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Plyingactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plyactivity);
        String nameSong = getIntent().getStringExtra("song");
        String nameArtist = getIntent().getStringExtra("artist");
        TextView textView = findViewById(R.id.song_name);
        TextView textView2 = findViewById(R.id.artist_name);
        textView.setText(nameSong);
        textView2.setText(nameArtist);
    }
}
