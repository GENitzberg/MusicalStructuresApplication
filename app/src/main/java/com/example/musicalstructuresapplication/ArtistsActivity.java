package com.example.musicalstructuresapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list_activity);

        ArrayList<Song> artistsArray = new ArrayList<Song>();
        artistsArray.add(new Song("Hello", "Adele", "25"));
        artistsArray.add(new Song("Water Under the Bridge", "Adele", "25"));
        artistsArray.add(new Song("I Miss You", "Adele", "25"));
        artistsArray.add(new Song("Shot for Me", "Drake", "Take Care"));
        artistsArray.add(new Song("Headlines", "Drake", "Take Care"));
        artistsArray.add(new Song("Doing it Wrong", "Drake", "Take Care"));
        artistsArray.add(new Song("Practice", "Drake", "Take Care"));
        artistsArray.add(new Song("Nonstop", "Drake", "Scorpion"));
        artistsArray.add(new Song("God's Plan", "Drake", "Scorpion"));
        artistsArray.add(new Song("I'm Upset", "Drake", "Scorpion"));
        artistsArray.add(new Song("Back to Sleep", "Chris Brown", "Royalty"));
        artistsArray.add(new Song("Deuces", "Chris Brown", "F.A.M.E"));
        artistsArray.add(new Song("H.O.L.Y", "Florida Georgia Line", "Dig Your Roots"));
        artistsArray.add(new Song("Sixteen", "Thomas Rhett", "Life Changes"));

        SongAdapter adapter = new SongAdapter(this, artistsArray);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
