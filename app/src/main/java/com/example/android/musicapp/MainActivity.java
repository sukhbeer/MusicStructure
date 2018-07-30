package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            final ArrayList<Song> songList = new ArrayList<>();
            songList.add(new Song("Party","Cardi B"));
            songList.add(new Song("Mad Dance","Maroon 5"));
            songList.add(new Song("Happy", "Selena Gomez"));
            songList.add(new Song("Fun","Calvin Harris feat. Frank Ocean & Migos"));
            songList.add(new Song("Playlist 1","Luis Fonsi & Daddy Yankee feat. Justin Bieber"));
            songList.add(new Song("Awesome","Harry Styles"));
            songList.add(new Song("Feel ft Balraj", "Balraj"));
            songList.add(new Song("Forever","Eminem"));
            songList.add(new Song("Haal Ve Rabba","Hans Raj Hans"));
            songList.add(new Song("Same Girl","Arjun"));

            SongAdapter adapter = new SongAdapter(this,songList);
            final ListView listView = findViewById(R.id.list);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent i = new Intent(MainActivity.this ,Plyingactivity.class);
                    i.putExtra("song", songList.get(position).getSongname());
                    i.putExtra("artist", songList.get(position).getArtistname());
                    startActivity(i);
                }
            });


    }
}
