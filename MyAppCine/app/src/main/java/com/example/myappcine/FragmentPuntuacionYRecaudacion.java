package com.example.myappcine;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentPuntuacionYRecaudacion extends Fragment {

   private int puntuacionYRecaudacionPF;
    public FragmentPuntuacionYRecaudacion() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            puntuacionYRecaudacionPF = getArguments().getInt("puntuacionPF");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_puntuacion_y_recaudacion, container, false);
        estructuraFragment(v);
        return v;
    }
    private void estructuraFragment(View v){
        TextView textView = v.findViewById(R.id.txtPuntuacionYRecaudacion);
        textView.setText(puntuacionYRecaudacionPF);
    }
}