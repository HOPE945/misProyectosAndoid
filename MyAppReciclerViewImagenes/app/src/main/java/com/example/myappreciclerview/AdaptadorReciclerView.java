package com.example.myappreciclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorReciclerView extends RecyclerView.Adapter<AdaptadorReciclerView.ViewHolder>{

    private ArrayList<Integer> imagenes = new ArrayList<>();
    private ViewHolder holder;
    private int position;

    public AdaptadorReciclerView(ArrayList<Integer> imagenes){
        this.imagenes = imagenes;

    }


    @Override
    public AdaptadorReciclerView.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.reciclerview_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder( AdaptadorReciclerView.ViewHolder holder, int position) {

        holder.asignarDatos(imagenes.get(position));
    }

    @Override
    public int getItemCount() {
        //tamaño del reciclerview
        return this.imagenes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        //funciona como on create
        private ImageView imageView;

        public ViewHolder( View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgRecicler);
        }
        //metodo para poder asignar valores provenientes del arrayList a los elementos views
        public void asignarDatos(Integer img){
            imageView.setImageResource(img);

        }
    }

}
