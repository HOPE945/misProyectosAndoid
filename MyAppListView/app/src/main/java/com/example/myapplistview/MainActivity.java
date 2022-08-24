package com.example.myapplistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ListView listView;
    ArrayList<String> vocales = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listViewVocales);
        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);









        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, vocales());
        listView.setAdapter(arrayAdapter);

        clickItem();
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item2:
                Toast.makeText(this, "Vocales abiertas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(this, "Vocales cerradas", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void clickItem(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            traslado(position);
            }
        });
    }

    private ArrayList<String> vocales(){
        this.vocales.add("A");
        this.vocales.add("E");
        this.vocales.add("I");
        this.vocales.add("O");
        this.vocales.add("U");
        return vocales;
    }

    //metodo que retorna a las imagenes como dato
      private ArrayList<Integer> imagenes(){
        ArrayList img = new ArrayList();
        img.add(R.drawable.una);
        img.add(R.drawable.mi);
        img.add(R.drawable.yo);
        img.add(R.drawable.o);
        img.add(R.drawable.u);
        return img;
    }

    private ArrayList<Integer> informacion(){
        ArrayList<Integer> info = new ArrayList<>();
        info.add(R.string.vocalA);
        info.add(R.string.vocalE);
        info.add(R.string.vocalI);
        info.add(R.string.vocal0);
        info.add(R.string.vocalU);
        return info;
    }

    private void traslado(int position){
        Intent intent = new Intent(this, MAVocales.class);
        intent.putExtra("imagenes", imagenes().get(position));
        intent.putExtra("informacion", informacion().get(position));

        startActivity(intent);
    }


}