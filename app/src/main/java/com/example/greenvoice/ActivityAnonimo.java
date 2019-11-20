package com.example.greenvoice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityAnonimo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.activity_main);


        Button bt = findViewById(R.id.btEntrar);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityAnonimo.this, ListaDeOcorrenciasActivity.class);
                startActivity(intent);
            }
        });
    }
}
