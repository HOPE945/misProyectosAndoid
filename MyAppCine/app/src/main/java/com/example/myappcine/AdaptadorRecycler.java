package com.example.myappcine;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
//pasos para el click del rcv

public class AdaptadorRecycler extends RecyclerView.Adapter<AdaptadorRecycler.ViewHolder> {
    //paso 2 para un clic propio (para ver el paso 1 ver la interfaz)
    private static ClickListener clickListener;

    private ArrayList<DatosVO> datosVO = new ArrayList<>();
    public AdaptadorRecycler(ArrayList<DatosVO> datosVO) {
        this.datosVO = datosVO;
    }



    @Override
    public AdaptadorRecycler.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
       ViewHolder vh = new ViewHolder(v);
       return vh;
    }

    @Override
    public void onBindViewHolder( AdaptadorRecycler.ViewHolder holder, int position) {
    holder.setData(datosVO.get(position).getImagen(),
                  datosVO.get(position).getNombre(),
                   datosVO.get(position).getDuracion(),
                   datosVO.get(position).getPrecio());


    }

    @Override
    public int getItemCount() {
        return this.datosVO.size();
    }
    //paso 3 implements

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView imageView;
        private TextView textViewNombre, textViewDuracion, textViewPrecio;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgRecycler);
            textViewNombre = itemView.findViewById(R.id.txtNombrePeliculaRecycler);
            textViewDuracion = itemView.findViewById(R.id.txtDuracionPeliculaRecycler);
            textViewPrecio = itemView.findViewById(R.id.txtPrecioPeliculaRecycler);


            //paso 6 lo que hace es abarcar por completo el item
            itemView.setOnClickListener(this);
        }



        private void setData(Integer img, Integer nombre, Integer duracion, Integer precio){
        imageView.setImageResource(img);
        textViewNombre.setText(nombre);
        textViewDuracion.setText(duracion);
        textViewPrecio.setText(precio);
        }
        //paso 4 metodo click
        @Override
        public void onClick(View view) {
            //paso 7
            clickListener.itemClick(getAdapterPosition(),view);

        }
    }

    //paso 5
    public void setItemCliskListener(ClickListener clickListener){
        AdaptadorRecycler.clickListener= clickListener;

    }

}
