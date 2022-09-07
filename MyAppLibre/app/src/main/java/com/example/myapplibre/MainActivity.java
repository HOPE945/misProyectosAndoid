package com.example.myapplibre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.VideoView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private VideoView videoView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    private ArrayList<Integer> videosNinos(){
        ArrayList<Integer> videos = new ArrayList<>();
        videos.add(R.raw.conejo);
        videos.add(R.raw.aveja);
        videos.add(R.raw.pollo);
        videos.add(R.raw.dino);
        videos.add(R.raw.erizo);
        videos.add(R.raw.rizos);
        return videos;
    }

}