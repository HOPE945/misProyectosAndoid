package com.example.myapppoemas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MAPoemaBandera extends AppCompatActivity {
    private Button btnBandera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapoema_bandera);
        btnBandera = findViewById(R.id.btnBandera);

        onClickRegresar();
    }

    private void onClickRegresar() {
        Intent regresar = new Intent(this, MainActivity.class);
        btnBandera.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { startActivity(regresar);

            }
        });
    }
}