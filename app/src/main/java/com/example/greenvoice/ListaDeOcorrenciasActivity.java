package com.example.greenvoice;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListaDeOcorrenciasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.listview);

        FloatingActionButton fab = findViewById(R.id.acionarActivityAddOcorrencia);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ListaDeOcorrenciasActivity.this, AddOcorrenciaActivity.class);
                startActivity(i);
            }
        });
    }
}