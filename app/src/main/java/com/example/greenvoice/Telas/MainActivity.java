package com.example.greenvoice.Telas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.greenvoice.Banco.UsuarioDao;
import com.example.greenvoice.Model.Usuario;
import com.example.greenvoice.R;

public class MainActivity extends AppCompatActivity {

    private EditText etNomeDoUsuario;
    private EditText etSenhaDoUsuario;

    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.activity_main);

        etNomeDoUsuario = findViewById(R.id.etNomeDeUsuario);
        etSenhaDoUsuario = findViewById(R.id.etSenhaDeUsuario);

        Button bt = findViewById(R.id.btEntrar);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario = etNomeDoUsuario.getText().toString();
                String senha = etSenhaDoUsuario.getText().toString();

                Usuario usu = new UsuarioDao(MainActivity.this).recuperarUsuario(usuario, senha);

                if(usu != null) {

                    Intent intent = new Intent(MainActivity.this, ActivityOpcao.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Usuário ou senha incorreto(s).", Toast.LENGTH_SHORT).show();
                }
            }
        });

        TextView tx = findViewById(R.id.TxCadastrar);
        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AddUserActivity.class);
                startActivity(i);
            }
        });

        Button btAnonimo = findViewById(R.id.btAnonimo);
        btAnonimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_opcao_ma.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this,  "O modo anônimo não permite o acompanhamento da denúncia!!", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
