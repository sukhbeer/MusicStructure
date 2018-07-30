package com.example.android.musicapp;


import android.content.Context;
import android.support.annotation.NonNull;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(@NonNull Context context, @NonNull ArrayList<Song> song) {
        super(context, 0, song);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.itemlist, parent, false);
        }
        Song currentWord = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.first_text_view);
        assert currentWord != null;
        miwokTextView.setText(currentWord.getSongname());
        TextView defaultTextView = listItemView.findViewById(R.id.second_text_view);
        defaultTextView.setText(currentWord.getArtistname());
        return listItemView;

    }
}
