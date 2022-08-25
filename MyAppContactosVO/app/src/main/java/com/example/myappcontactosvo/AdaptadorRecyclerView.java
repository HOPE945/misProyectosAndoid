package com.example.myappcontactosvo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorRecyclerView extends RecyclerView.Adapter<AdaptadorRecyclerView.ViewHolder> {
    //receptor
    private ArrayList<DatosContactoVO> datosVO = new ArrayList<>();
   //Constructor
    public AdaptadorRecyclerView(ArrayList<DatosContactoVO> datosVO) {
        this.datosVO = datosVO;
    }

    @NonNull
    @Override
    public AdaptadorRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRecyclerView.ViewHolder holder, int position) {
        //aqui recibo la info
        holder.asignarDatos(datosVO.get(position).getNombreContacto(), datosVO.get(position).getNumeroContacto(),
                datosVO.get(position).getImagenContacto());
    }

    @Override
    public int getItemCount() {
        return this.datosVO.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        //aqui declaro mis variables
        private TextView textViewNombreContacto, textViewNumeroContacto;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNombreContacto = itemView.findViewById(R.id.txtNombreContactoRecycler);
            textViewNumeroContacto = itemView.findViewById(R.id.txtNumeroTelefonoRecycler);
            imageView = itemView.findViewById(R.id.imgRecycler);
        }

        //metodo para asignar los datos del mismo tipo
        private void asignarDatos(String nombre, String numero, Integer imagen){
        textViewNombreContacto.setText(String.valueOf(nombre));
        textViewNumeroContacto.setText(String.valueOf(numero));
        imageView.setImageResource(imagen);
        }
    }
}
