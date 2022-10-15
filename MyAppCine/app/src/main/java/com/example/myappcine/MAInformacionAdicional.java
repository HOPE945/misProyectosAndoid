package com.example.myappcine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MAInformacionAdicional extends AppCompatActivity {
    private ImageView imageView;
    private TextView textViewNombre, textViewmoneda, textViewprecio;
    private Fragment fragmentSinopsis, fragmentDirecActores, fragmentPuntua;
    private FragmentTransaction transaction;
    private TabLayout tabLayout;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainformacion_adicional);
        textViewNombre = findViewById(R.id.txtNomPeliInfoAdicional);
        textViewmoneda = findViewById(R.id.txtMonedaPeliInfoAdicional);
        textViewprecio = findViewById(R.id.txtPrecioPeliInfoAdicional);

        imageView = findViewById(R.id.imgInfoAdicional);


        tabLayout = findViewById(R.id.tlId);

        tabLayout.addTab(tabLayout.newTab().setText("Sinopsis"));
        tabLayout.addTab(tabLayout.newTab().setText("Director y Elenco"));
        tabLayout.addTab(tabLayout.newTab().setText("Puntuación y Recaudacion"));

        fragmentSinopsis = new FragmentSinopsis();
        fragmentDirecActores = new FragmentDirectoresYactores();
        fragmentPuntua = new FragmentPuntuacionYRecaudacion();
        getSupportFragmentManager().beginTransaction().add(R.id.flContenedorInfoAdicional, fragmentSinopsis).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.flContenedorInfoAdicional, fragmentDirecActores).hide(fragmentDirecActores).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.flContenedorInfoAdicional, fragmentPuntua).hide(fragmentPuntua).commit();

        button = findViewById(R.id.btnComprarBoletos);

        this.getData();
        this.ontenerYtrasladarInformacionAdicional();
        this.navegacionTabLayout();
        this.clickBoleto();
        this.clickImagen();

    }

    private void clickImagen() {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MAImagenCompleta.class);

                startActivity(intent);
            }
        });

    }


    private void clickBoleto() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            comBolet();
            }
        });
    }

    private void comBolet(){
        String precio = textViewprecio.getText().toString();

        Intent intent = new Intent(this, MACompraBoletos.class);
        intent.putExtra("precio", precio);
        startActivity(intent);
    }


    //no tocar esto si sirve
    private void navegacionTabLayout() {
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                transaction = getSupportFragmentManager().beginTransaction();
                switch (tab.getPosition()) {
                    case 0:
                        if (fragmentSinopsis.isAdded()) {
                            transaction.hide(fragmentDirecActores).hide(fragmentPuntua).show(fragmentSinopsis);
                        } else {
                            transaction.hide(fragmentDirecActores).hide(fragmentPuntua).add(R.id.flContenedorInfoAdicional, fragmentSinopsis).addToBackStack(null);
                        }
                        break;
                    case 1:
                        if (fragmentDirecActores.isAdded()) {
                            transaction.hide(fragmentSinopsis).hide(fragmentPuntua).show(fragmentDirecActores);
                        } else {
                            transaction.hide(fragmentSinopsis).hide(fragmentPuntua).add(R.id.flContenedorInfoAdicional, fragmentDirecActores).addToBackStack(null);
                        }
                        break;
                    case 2:
                        if (fragmentPuntua.isAdded()) {
                            transaction.hide(fragmentSinopsis).hide(fragmentDirecActores).show(fragmentPuntua);
                        } else {
                            transaction.hide(fragmentSinopsis).hide(fragmentDirecActores).add(R.id.flContenedorInfoAdicional, fragmentPuntua).addToBackStack(null);
                        }
                        break;
                }
                transaction.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    private void getData() {
        Bundle bundle = getIntent().getExtras();
        int nombreP = bundle.getInt("nombreP");
        int imgP = bundle.getInt("imgP");
        int precioP = bundle.getInt("precioP");

        //recibiendo los datos
        textViewNombre.setText(nombreP);
        imageView.setImageResource(imgP);
        textViewprecio.setText(precioP);


    }



    //obtieniendo y trasladando los datos a los fragments
    private void ontenerYtrasladarInformacionAdicional(){
        Bundle bundle = getIntent().getExtras();
        int sinopsisP = bundle.getInt("sinopsisP");
        int puntuacionP = bundle.getInt("puntuacionP");
        int directoresP= bundle.getInt("directoresP");

        this.trasladarInformacionSinopsis(sinopsisP);
        this.trasladarInformacionPuntuacion(puntuacionP);
        this.trasladarInformacionDirectores(directoresP);
    }




    private void trasladarInformacionSinopsis(int sinopsisP){
        Bundle bundle = new Bundle();
        bundle.putInt("sinopsisPF", sinopsisP);
        fragmentSinopsis.setArguments(bundle);
    }
    private void trasladarInformacionPuntuacion(int puntuacionP){
        Bundle bundle = new Bundle();
        bundle.putInt("puntuacionPF", puntuacionP);
        fragmentPuntua.setArguments(bundle);
    }

    private void trasladarInformacionDirectores(int directoresP){
        Bundle bundle = new Bundle();
        bundle.putInt("directoresPF", directoresP);
        fragmentDirecActores.setArguments(bundle);
    }






}


