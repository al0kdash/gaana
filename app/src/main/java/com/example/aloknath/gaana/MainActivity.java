package com.example.aloknath.gaana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playlist = (Button)findViewById(R.id.playlist);
        Button artist = (Button)findViewById(R.id.artist);
        Button albums = (Button)findViewById(R.id.albums);
        Button songs = (Button)findViewById(R.id.songs);
        ImageView cart = (ImageView)findViewById(R.id.cart);
        //on click listener on playlist button
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),PlaylistActivity.class);
                startActivity(intent);
            }
        });

        //on click listener on artist button
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ArtistActivity.class);
                startActivity(intent);
            }
        });

        //on click listener on albums button
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),AlbumsActivity.class);
                startActivity(intent);
            }
        });

        //on click listener on songs button
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),SongsActivity.class);
                startActivity(intent);
            }
        });

        //om click listener on Image View
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),BuyActivity.class);
                startActivity(intent);
            }
        });

    }
}
