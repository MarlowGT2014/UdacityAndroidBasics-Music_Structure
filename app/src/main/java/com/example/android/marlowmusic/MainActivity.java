package com.example.android.marlowmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView albums = (TextView) findViewById(R.id.albumsButton);
        TextView artists = (TextView) findViewById(R.id.artistsButton);
        TextView songs = (TextView) findViewById(R.id.songsButton);
        TextView random = (TextView) findViewById(R.id.randomButton);


        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(playlistIntent);
            }
        });

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(playlistIntent);
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(playlistIntent);
            }
        });

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, RandomActivity.class);
                startActivity(playlistIntent);
            }
        });

    }
}
