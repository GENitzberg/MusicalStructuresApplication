package com.example.musicalstructuresapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();
    public SongAdapter(Activity context, ArrayList<Song> songs) {super(context, 0, songs);}

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if existing view is being reused, otherwise inflate the value
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_activity, parent, false);
        }

        //Get the Song object located at this position in the list
        Song currentSong = getItem(position);
        //Find the right TextView
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song);
        //Set the text in the view
        songTextView.setText(currentSong.getmSongName());
        //Find the right TextView
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist);
        //Set the text in the view
        artistTextView.setText(currentSong.getmArtistName());
        //Find the right TextView
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album);
        //Set the text in the view
        albumTextView.setText(currentSong.getmAlbumName());
        //Return the whole list item layout
        return listItemView;
    }
}
