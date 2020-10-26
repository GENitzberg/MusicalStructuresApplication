package com.example.musicalstructuresapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list_activity);

        ArrayList<Song> songsArray = new ArrayList<Song>();
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

        SongAdapter adapter = new SongAdapter(this, songsArray);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
