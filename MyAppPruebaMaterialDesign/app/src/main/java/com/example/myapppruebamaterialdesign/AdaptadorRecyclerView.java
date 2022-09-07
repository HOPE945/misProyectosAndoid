package com.example.myapppruebamaterialdesign;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorRecyclerView extends RecyclerView.Adapter<AdaptadorRecyclerView.ViewHolder> {
    //crear el array del mismo tipo en
    private ArrayList<DatosVO> datosVO = new ArrayList<>();
    public ImageView imgMiniatura;
    public TextView textViewNombre;
    public CardView cardView;
    //constructor
    public AdaptadorRecyclerView(ArrayList<DatosVO> datosVO) {
        this.datosVO = datosVO;
    }


    @NonNull
    @Override
    public AdaptadorRecyclerView.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
       ViewHolder viewHolder = new ViewHolder(v);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AdaptadorRecyclerView.ViewHolder holder, int position) {
    holder.asignarDatos(datosVO.get(position).getNombreAuto(), datosVO.get(position).getDescripcionAuto(),
            datosVO.get(position).getImagenAuto());
    }

    @Override
    public int getItemCount() {
        return this.datosVO.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        //estas son las variables de los elementos
        private CardView cardView;
        private TextView textViewNombre, textViewDescripcion;
        private ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            //
            textViewNombre = itemView.findViewById(R.id.nombreAutoRecycler);
            textViewDescripcion = itemView.findViewById(R.id.descripcionAutoRecycler);
            cardView = itemView.findViewById(R.id.contenedorPrincipal);
            imageView = itemView.findViewById(R.id.imgAutoRecycler);

        }

        //metodo de retorno void para asignar datos
        private void asignarDatos(String nombre, String descripcion, Integer imagen){

            textViewNombre.setText(String.valueOf(nombre));
            textViewDescripcion.setText(String.valueOf(descripcion));
            imageView.setImageResource(imagen);

        }

    }
}
