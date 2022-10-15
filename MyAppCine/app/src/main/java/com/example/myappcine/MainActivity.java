package com.example.myappcine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.rvId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //divide
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        dividerItemDecoration.setDrawable(getResources().getDrawable(R.drawable.recyclerview_divider));
        recyclerView.addItemDecoration(dividerItemDecoration);

        AdaptadorRecycler adaptadorRecycler = new AdaptadorRecycler(this.setItem());
        clicRecycler(adaptadorRecycler);
        recyclerView.setAdapter(adaptadorRecycler);



    }

    private void clicRecycler(AdaptadorRecycler adaptadorRecycler) {
        adaptadorRecycler.setItemCliskListener(new ClickListener() {
            @Override
            public void itemClick(Integer position, View v) {

            trasladarDatos(position);

            }
        });


    }


    private ArrayList<DatosVO> setItem() {
        ArrayList<DatosVO> item = new ArrayList<>();
        item.add(new DatosVO(R.drawable.deadpool2,R.string.nombre_dp,R.string.duracion_dp,R.integer.precio_dp));
        item.add(new DatosVO(R.drawable.lapurga,R.string.nombre_pg,R.string.duracion_pg,R.integer.precio_pg));
        item.add(new DatosVO(R.drawable.punish,R.string.nombre_ns,R.string.duracion_ns,R.integer.precio_ns));
        item.add(new DatosVO(R.drawable.mobius,R.string.nombre_mobi,R.string.duracion_mobi,R.integer.precio_mobi));
        item.add(new DatosVO(R.drawable.swart,R.string.nombre_sw, R.string.duracion_sw,R.integer.precio_sw));
        item.add(new DatosVO(R.drawable.suicidesq,R.string.nombre_sc,R.string.duracion_sc,R.integer.precio_sc));
        item.add(new DatosVO(R.drawable.myher,R.string.nombre_mh,R.string.duracion_mh,R.integer.precio_mh));
        item.add(new DatosVO(R.drawable.deote,R.string.nombre_no,R.string.duracion_no,R.integer.precio_no));
        item.add(new DatosVO(R.drawable.docstran,R.string.nombre_dr,R.string.duracion_dr,R.integer.precio_dr));
        item.add(new DatosVO(R.drawable.blackphone,R.string.nombre_ph,R.string.duracion_ph,R.integer.precio_ph));

        return item;
    }


    private ArrayList<DatosVO> setIDatosAdicionales(){
        ArrayList<DatosVO> datosinfo = new ArrayList<>();
        datosinfo.add(new DatosVO(R.string.sinpsis_dp, R.string.dirac_dp,R.string.punt_dp));
        datosinfo.add(new DatosVO(R.string.sinpsis_pg,R.string.dirac_pg,R.string.punt_pg));
        datosinfo.add(new DatosVO(R.string.sinpsis_ns,R.string.dirac_ns,R.string.punt_ns));
        datosinfo.add(new DatosVO(R.string.sinpsis_mobi,R.string.dirac_mobi,R.string.punt_mobi));
        datosinfo.add(new DatosVO(R.string.sinpsis_sw,R.string.dirac_sw,R.string.punt_sw));
        datosinfo.add(new DatosVO(R.string.sinpsis_sc,R.string.dirac_sc,R.string.punt_sc));
        datosinfo.add(new DatosVO(R.string.sinpsis_mh,R.string.dirac_mh,R.string.punt_mh));
        datosinfo.add(new DatosVO(R.string.sinpsis_no,R.string.dirac_no,R.string.punt_no));
        datosinfo.add(new DatosVO(R.string.sinpsis_dr,R.string.dirac_dr,R.string.punt_dr));
        datosinfo.add(new DatosVO(R.string.sinpsis_ph,R.string.dirac_ph,R.string.punt_ph));

        return datosinfo;
    }

    private void trasladarDatos(int position) {
        Intent intent = new Intent(getApplicationContext(), MAInformacionAdicional.class);
        intent.putExtra("nombreP", setItem().get(position).getNombre());
        intent.putExtra("imgP", setItem().get(position).getImagen());
        intent.putExtra("precioP", setItem().get(position).getPrecio());
        //adicional
        intent.putExtra("sinopsisP",setIDatosAdicionales().get(position).getSinopsis());
        intent.putExtra("directoresP", setIDatosAdicionales().get(position).getDirectores());
        intent.putExtra("puntuacionP", setIDatosAdicionales().get(position).getPuntuacion());
        startActivity(intent);
    }

    //no tocar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                break;
            case R.id.item2:
                recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}