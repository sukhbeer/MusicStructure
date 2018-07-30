package com.example.android.musicapp;

public class Song {
    private String songname;
    private String  artistname;

    public Song(String songname, String artistname) {
        this.songname = songname;
        this.artistname = artistname;
    }

    public String getSongname() {
        return songname;
    }

    public String getArtistname() {
        return artistname;
    }


}
