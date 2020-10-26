package com.example.musicalstructuresapplication;

public class Song {
    private String mSongName;
    private String mArtistName;
    private String mAlbumName;

    //Creating the constructor
public Song(String defaultSong, String defaultArtist, String defaultAlbum){

    mSongName = defaultSong;
    mArtistName = defaultArtist;
    mAlbumName = defaultAlbum;
}

    //Get the song of selected track
    public String getmSongName(){return mSongName;}

    //Get the artist of the selected track
    public String getmArtistName(){return mArtistName;}

    //Get the album of the selected track
    public String getmAlbumName(){return mAlbumName;}
}
