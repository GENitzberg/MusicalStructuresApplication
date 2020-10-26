package com.example.musicalstructuresapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list_activity);

        ArrayList<Song> albumsArray = new ArrayList<Song>();
        albumsArray.add(new Song("Hello", "Adele", "25"));
        albumsArray.add(new Song("Water Under the Bridge", "Adele", "25"));
        albumsArray.add(new Song("I Miss You", "Adele", "25"));
        albumsArray.add(new Song("Shot for Me", "Drake", "Take Care"));
        albumsArray.add(new Song("Headlines", "Drake", "Take Care"));
        albumsArray.add(new Song("Doing it Wrong", "Drake", "Take Care"));
        albumsArray.add(new Song("Practice", "Drake", "Take Care"));
        albumsArray.add(new Song("Nonstop", "Drake", "Scorpion"));
        albumsArray.add(new Song("God's Plan", "Drake", "Scorpion"));
        albumsArray.add(new Song("I'm Upset", "Drake", "Scorpion"));
        albumsArray.add(new Song("Back to Sleep", "Chris Brown", "Royalty"));
        albumsArray.add(new Song("Deuces", "Chris Brown", "F.A.M.E"));
        albumsArray.add(new Song("H.O.L.Y", "Florida Georgia Line", "Dig Your Roots"));
        albumsArray.add(new Song("Sixteen", "Thomas Rhett", "Life Changes"));

        SongAdapter adapter = new SongAdapter(this, albumsArray);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
