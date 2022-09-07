package com.example.myapppruebamaterialdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigation);


        recyclerView = findViewById(R.id.rvId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AdaptadorRecyclerView adaptadorRecyclerView = new AdaptadorRecyclerView(this.datosVO());
        recyclerView.setAdapter(adaptadorRecyclerView);

    }
    //Arreglo de tipo clase que es DatosVO
    private ArrayList<DatosVO> datosVO(){
        ArrayList<DatosVO> datos = new ArrayList<>();
        //llenado de informacion por medio de un constructor
        datos.add(new DatosVO("Corvette C8", "De O a 100 km/h en 2,2 segundos.", R.drawable.amarillo));
        datos.add(new DatosVO("Bugatti Chiron", "De 0 a 420 km/h 2,1 segundos", R.drawable.bugatichiron));
        datos.add(new DatosVO("Bugatti Veiron", "De 0 a 415 km/h en 2,2", R.drawable.bugativeiron));
        datos.add(new DatosVO("Koningsegg Jesko", "De 0 a 411 km/h en 2,9", R.drawable.koenesko));
        datos.add(new DatosVO("Koningsegg Agera rs", "De 0 a 400 km/h en 3,1", R.drawable.koenigseggagera));
        datos.add(new DatosVO("Rimac nevera", "De 0 a 412 km/h en 3,1", R.drawable.rimacnevera));
        return datos;
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.favoritos:
                break;
            case R.id.inicio:
                break;
            case R.id.raccionar:
                break;
        }




        return super.onOptionsItemSelected(item);
    }




}