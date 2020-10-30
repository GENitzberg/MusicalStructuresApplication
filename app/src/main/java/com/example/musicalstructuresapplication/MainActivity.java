package com.example.musicalstructuresapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Setting up the content of the main activity
        setContentView(R.layout.activity_main);

        //Setting up onClick listeners for all search options
        final TextView songs = (TextView) findViewById(R.id.song_names);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(i);
            }
        });

        TextView artists = (TextView) findViewById(R.id.artist_names);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(i);
            }
        });

        TextView albums = (TextView) findViewById(R.id.album_names);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(i);
            }
        });

        final ArrayList<Song> songsArray = new ArrayList<Song>();
        songsArray.add(new Song("Hello", "Adele", "25"));
        songsArray.add(new Song("Water Under the Bridge", "Adele", "25"));
        songsArray.add(new Song("I Miss You", "Adele", "25"));
        songsArray.add(new Song("Shot for Me", "Drake", "Take Care"));
        songsArray.add(new Song("Headlines", "Drake", "Take Care"));
        songsArray.add(new Song("Doing it Wrong", "Drake", "Take Care"));
        songsArray.add(new Song("Practice", "Drake", "Take Care"));
        songsArray.add(new Song("Nonstop", "Drake", "Scorpion"));
        songsArray.add(new Song("God's Plan", "Drake", "Scorpion"));
        songsArray.add(new Song("I'm Upset", "Drake", "Scorpion"));
        songsArray.add(new Song("Back to Sleep", "Chris Brown", "Royalty"));
        songsArray.add(new Song("Deuces", "Chris Brown", "F.A.M.E"));
        songsArray.add(new Song("H.O.L.Y", "Florida Georgia Line", "Dig Your Roots"));
        songsArray.add(new Song("Sixteen", "Thomas Rhett", "Life Changes"));

        TextView nowPlaying = findViewById(R.id.now_playing_text_view);
        nowPlaying.setText("Song Name:    " + songsArray.get(index).getmSongName() +
                            "\nArtist Name:    " + songsArray.get(index).getmArtistName() +
                            "\nAlbum Name:    " + songsArray.get(index).getmAlbumName());

        /*OnClick listeners for the fast forward button to display current song*/
        Button forward = findViewById(R.id.forward_button);
        forward.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int i = index;
                int totalSongs = songsArray.size();
                if(i < totalSongs){
                    TextView nowPlaying = findViewById(R.id.now_playing_text_view);
                    nowPlaying.setText("Song Name:    " + songsArray.get(i).getmSongName() +
                            "\nArtist Name:    " + songsArray.get(i).getmArtistName() +
                            "\nAlbum Name:    " + songsArray.get(i).getmAlbumName());
                    if(i < totalSongs-1){
                    index++;
                    }
                    else{
                            Toast.makeText(getApplicationContext(), "No more songs in playlist",
                                    Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        Button rewind = findViewById(R.id.rewind_button);
        rewind.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int i = index;
                if(i > -1){
                    TextView nowPlaying = findViewById(R.id.now_playing_text_view);
                    nowPlaying.setText("Song Name:    " + songsArray.get(i).getmSongName() +
                            "\nArtist Name:    " + songsArray.get(i).getmArtistName() +
                            "\nAlbum Name:    " + songsArray.get(i).getmAlbumName());
                    if(i>0){
                    index--;
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "This is the first song in playlist",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}