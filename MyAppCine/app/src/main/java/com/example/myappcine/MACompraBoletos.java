package com.example.myappcine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MACompraBoletos extends AppCompatActivity {
private TextView txtPrecioPelicula, txtTotalAPagar, txtPrecioBoletos;
private Button btnRealizarCompra, btnRegresar;
private EditText cantidadBoletos, nitCliente, apellidoCliente, nombreCliente;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macompra_boletos);
        //boton
        btnRealizarCompra = findViewById(R.id.btnRealizarCompra);
        btnRegresar = findViewById(R.id.btnRegresar);
        //Edt
        nombreCliente = findViewById(R.id.edtNombre);
        apellidoCliente = findViewById(R.id.edtApellido);
        cantidadBoletos = findViewById(R.id.edtCantidad);
        nitCliente = findViewById(R.id.edtNit);
        //TextView
        txtTotalAPagar = findViewById(R.id.textViewTotalAPagar);
        txtPrecioBoletos = findViewById(R.id.txtPrecioBoletos);
        obtener();
        finalizarCompra();

        btnRegresar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                regresar();
            }
        });


    }
    //recibiendo el precio porque es lo unico que estoy reutilizando
    private void obtener(){
        Bundle bundle = getIntent().getExtras();
        String precio = bundle.getString("precio");
        //

        txtPrecioBoletos.setText(String.valueOf(precio));
    }

    private void finalizarCompra(){
        btnRealizarCompra.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
               comprar();
            }
        });
    }

    private void comprar(){
        String nombreCliente = this.nombreCliente.getText().toString();
        String apellidoCliente = this.apellidoCliente.getText().toString();
        String nitCliente = this.nitCliente.getText().toString();

        String precioBoletos = this.txtPrecioBoletos.getText().toString();
        String cantidadBoletos = this.cantidadBoletos.getText().toString();
        if(!nombreCliente.isEmpty()&&!apellidoCliente.isEmpty()&&!nitCliente.isEmpty()){
            int total = Integer.parseInt(precioBoletos)* Integer.parseInt(cantidadBoletos);
            txtTotalAPagar.setText("Adquirio  "+cantidadBoletos+" boletos, "+ " total pagado es de Q. "+total+".00");
        }

    }

    private void regresar(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}