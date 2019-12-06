package com.example.greenvoice.Telas;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.greenvoice.Banco.OcorrenciasDao;
import com.example.greenvoice.Model.Ocorrencias;
import com.example.greenvoice.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListaDeOcorrenciasActivity extends AppCompatActivity {

    private OcorrenciasDao dao;

    private ListView listaDeOcorrencias;

    private OcorrenciasAdapter adaptador;

    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.listview);

        dao = new OcorrenciasDao(this);

        adaptador = new OcorrenciasAdapter(dao.listarOcorrencias(), this);

        Log.i("Script", "Qtd: " + adaptador.getCount());

        listaDeOcorrencias = findViewById(R.id.listaDeDenuncias);
        listaDeOcorrencias.setAdapter(adaptador);

        registerForContextMenu(listaDeOcorrencias);

        FloatingActionButton fab = findViewById(R.id.acionarActivityAddOcorrencia);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ListaDeOcorrenciasActivity.this, AddOcorrenciaActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        adaptador.atualizar(dao.listarOcorrencias());
    }
}