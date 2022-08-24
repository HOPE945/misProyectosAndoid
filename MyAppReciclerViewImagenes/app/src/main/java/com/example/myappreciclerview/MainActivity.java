package com.example.myappreciclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recView);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        AdaptadorReciclerView adaptadorReciclerView = new AdaptadorReciclerView(imagenes());
       recyclerView.setAdapter(adaptadorReciclerView);



    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                break;
            case R.id.item2:
                recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private ArrayList<Integer> imagenes(){
        ArrayList<Integer> img = new ArrayList<>();
        img.add(R.drawable.r1);
        img.add(R.drawable.r2);
        img.add(R.drawable.r3);
        img.add(R.drawable.r4);
        img.add(R.drawable.r5);
        img.add(R.drawable.r6);
        img.add(R.drawable.r7);
        img.add(R.drawable.r8);
        img.add(R.drawable.r9);
        img.add(R.drawable.r10);
        return img;
    }

}