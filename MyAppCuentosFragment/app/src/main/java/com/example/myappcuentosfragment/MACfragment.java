package com.example.myappcuentosfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MACfragment extends AppCompatActivity {
    private FragmentTransaction transaction;
    private Fragment fragmentU, fragmentD, fragmentT, fragmentC, fragmentCin;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macfragment);
        //instanciando las variables
        tabLayout = findViewById(R.id.tablayId);
        //creando las tabs lo que escriba aqui es el texto que se muestra en la tab
        tabLayout.addTab(tabLayout.newTab().setText("Reina Nieves"));
        tabLayout.addTab(tabLayout.newTab().setText("Hansel/Gretel"));
        tabLayout.addTab(tabLayout.newTab().setText("La Carreta"));
        tabLayout.addTab(tabLayout.newTab().setText("El Cadejo"));
        tabLayout.addTab(tabLayout.newTab().setText("La Flor"));

        fragmentU = new Fragment1();
        fragmentD = new Fragment2();
        fragmentT = new Fragment3();
        fragmentC = new Fragment4();
        fragmentCin = new Fragment5();


        //Agregando fragment al contenedor ocultando, mostrando e inicializado los fragment deseados
        getSupportFragmentManager().beginTransaction().add(R.id.frlContenedor,fragmentU).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frlContenedor,fragmentD).hide(fragmentD).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frlContenedor,fragmentT).hide(fragmentT).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frlContenedor,fragmentC).hide(fragmentC).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frlContenedor,fragmentCin).hide(fragmentCin).commit();
        accionTabLayout();
    }
    private void accionTabLayout(){
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                transaction = getSupportFragmentManager().beginTransaction();
                switch (tab.getPosition()){
                    case 0:
                        if(fragmentU.isAdded()){
                            transaction.hide(fragmentD).hide(fragmentT).hide(fragmentC).hide(fragmentCin).show(fragmentU);
                        }else{
                            transaction.hide(fragmentD).hide(fragmentT).hide(fragmentC).hide(fragmentCin).add(R.id.frlContenedor,fragmentU);
                        }
                        break;
                    case 1:
                        if(fragmentD.isAdded()){
                            transaction.hide(fragmentU).hide(fragmentT).hide(fragmentC).hide(fragmentCin).show(fragmentD);
                        }else{
                            transaction.hide(fragmentU).hide(fragmentT).hide(fragmentC).hide(fragmentCin).add(R.id.frlContenedor,fragmentD);
                        }
                        break;
                    case 2:
                        if(fragmentT.isAdded()){
                            transaction.hide(fragmentU).hide(fragmentD).hide(fragmentC).hide(fragmentCin).show(fragmentT);
                        }else{
                            transaction.hide(fragmentU).hide(fragmentD).hide(fragmentC).hide(fragmentCin).add(R.id.frlContenedor,fragmentT);
                        }
                        break;
                    case 3:
                        if(fragmentC.isAdded()){
                            transaction.hide(fragmentU).hide(fragmentD).hide(fragmentT).hide(fragmentCin).show(fragmentC);
                        }else{
                            transaction.hide(fragmentU).hide(fragmentD).hide(fragmentT).hide(fragmentCin).add(R.id.frlContenedor,fragmentC);
                        }
                        break;
                    case 4:
                        if(fragmentCin.isAdded()){
                            transaction.hide(fragmentU).hide(fragmentD).hide(fragmentT).hide(fragmentC).show(fragmentCin);
                        }else{
                            transaction.hide(fragmentU).hide(fragmentD).hide(fragmentT).hide(fragmentC).add(R.id.frlContenedor,fragmentCin);
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

}