package com.example.myapppoemas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MAQuetzal extends AppCompatActivity {
    private Button btnQuetzalR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maquetzal);
        btnQuetzalR = findViewById(R.id.btnQuetzalR);

        onClickRegre();
    }

    private void onClickRegre() {
        Intent regresar = new Intent(this, MainActivity.class);
        btnQuetzalR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startActivity(regresar);

            }
        });
    }
}