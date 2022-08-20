package com.example.myappartemoderno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MAAdquirir extends AppCompatActivity {
    private ImageView imageView;
    private TextView txtViewTituloAdquirir, txtViewPrecAdquirir, txtViewMonedaAdquirir, txtViewPrecioAdquirir, txtResultado;
    private Button btnCompra, btnCancelarCompra;
    private EditText edtNombreCliente, edtApellidoCliente, edtNITCliente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maadquirir);
        imageView = findViewById(R.id.imgAdquirir);
        txtViewTituloAdquirir = findViewById(R.id.txtViewTituloAdquirir);
        txtViewPrecAdquirir = findViewById(R.id.txtViewPrecAdquirir);
        txtViewMonedaAdquirir = findViewById(R.id.txtViewMonedaAdquirir);
        txtViewPrecioAdquirir = findViewById(R.id.txtViewPrecioAdquirir);

        //edt
        edtNombreCliente = findViewById(R.id.edtNombreCliente);
        edtApellidoCliente = findViewById(R.id.edtApellidoCliente);
        edtNITCliente = findViewById(R.id.edtNITCliente);
        //btns
        btnCompra = findViewById(R.id.btnCompra);
        btnCancelarCompra = findViewById(R.id.btnCancelarCompra);

        this.clickCancelarCompra();
        this.comprar();
        this.obtener();

    }

    private void comprar(){
        btnCompra.setOnClickListener(new View.OnClickListener() {
            public void onClick() {
                onClick();
            }
            public void onClick(View view){
                String titulo = txtViewTituloAdquirir.getText().toString();
                String prec = txtViewPrecAdquirir.getText().toString();
                String moneda = txtViewMonedaAdquirir.getText().toString();
                String precio = txtViewPrecioAdquirir.getText().toString();
                String nomb = edtNombreCliente.getText().toString();
                String ape = edtApellidoCliente.getText().toString();
                String nume = edtNITCliente.getText().toString();

                if(!nomb.isEmpty() && !ape.isEmpty()  && !nume.isEmpty() ) {
                    double val = Double.parseDouble(precio);
                    double  total = (double) (val * (1.12));

                    Intent realizarCompra = new Intent(getApplicationContext(), MAFinalizarCompra.class);
                    realizarCompra.putExtra("titulo", titulo);
                    realizarCompra.putExtra("prec", prec);
                    realizarCompra.putExtra("moneda", moneda);
                    realizarCompra.putExtra("precio", precio);
                    realizarCompra.putExtra("nomb", nomb);
                    realizarCompra.putExtra("ape", ape);
                    realizarCompra.putExtra("nume", nume);
                    realizarCompra.putExtra("total", total);


                    startActivity(realizarCompra);


                }else{
                    Toast.makeText(MAAdquirir.this, "Debe llenar todos los campos", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }

    private void clickCancelarCompra() {
        btnCancelarCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelar();
            }
        });
    }

    private void cancelar() {
        Intent cancelarCompra = new Intent(this, MainActivity.class);
        startActivity(cancelarCompra);
        //finish();
    }

    private void obtener() {
        Bundle bundle = getIntent().getExtras();
        Integer imgObra = bundle.getInt("imgObra");
        String titulo = bundle.getString("titulo");
        String prec = bundle.getString("prec");
        String moneda = bundle.getString("moneda");
        Integer precio = bundle.getInt("precio");


        //seteando datos
        imageView.setImageResource(imgObra);
        txtViewTituloAdquirir.setText(String.valueOf(titulo));
        txtViewPrecAdquirir.setText(String.valueOf(prec));
        txtViewMonedaAdquirir.setText(String.valueOf(moneda));
        txtViewPrecioAdquirir.setText(String.valueOf(precio));
    }
    private void clickCompra() {
        btnCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }







}

