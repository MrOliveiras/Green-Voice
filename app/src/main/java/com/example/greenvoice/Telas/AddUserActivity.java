package com.example.greenvoice.Telas;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.greenvoice.Banco.UsuarioDao;
import com.example.greenvoice.Contatos.Usuario;
import com.example.greenvoice.R;

public class AddUserActivity extends AppCompatActivity {

    private EditText etNome;
    private EditText etNomeDeUsuario1;
    private EditText etTelefoneDoUsuario;
    private EditText etEmailDoUsuario;
    private EditText etSenha;

    private Usuario usuario;

    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.add_user_view);

        etNome = findViewById(R.id.etNome);
        etNomeDeUsuario1 = findViewById(R.id.etNomeDeUsuario1);
        etTelefoneDoUsuario = findViewById(R.id.etTelefoneDoUsuario);
        etEmailDoUsuario = findViewById(R.id.etEmailDoUsuario);
        etSenha = findViewById(R.id.etSenha);

        Intent intent = getIntent();
        if(intent.hasExtra("usuario")) {
            usuario = (Usuario) intent.getSerializableExtra("usuario");

            etNome.setText(usuario.getNomeCompleto());
            etNomeDeUsuario1.setText(usuario.getUser());
            etTelefoneDoUsuario.setText(usuario.getTelefone());
            etEmailDoUsuario.setText(usuario.getEmail());
            etSenha.setText(usuario.getSenha());

        }

        Button bt = findViewById(R.id.botaoCadastrarUsuario);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nomeCompleto = etNome.getText().toString();
                String nome_de_usuario = etNomeDeUsuario1.getText().toString();
                String telefone_de_usuario = etTelefoneDoUsuario.getText().toString();
                String email_de_usuario = etEmailDoUsuario.getText().toString();
                String senha_de_usuario = etSenha.getText().toString();

                Usuario novoUsuario = new Usuario(nomeCompleto, 0, nome_de_usuario,
                        telefone_de_usuario, email_de_usuario, senha_de_usuario);

                UsuarioDao dao = new UsuarioDao(AddUserActivity.this);

                Intent intent = getIntent();

                if(!nomeCompleto.equals("") && !email_de_usuario.equals("")&&!nome_de_usuario.equals("") && !telefone_de_usuario.equals("")&&!senha_de_usuario.equals("")) {

                    if (intent.hasExtra("usuario")) {
                        novoUsuario.setCodUsuario(usuario.getCodUsuario());

                        dao.atualizar(novoUsuario);

                        System.out.println(novoUsuario.getCodUsuario() + " " + novoUsuario.toString());

                    } else {
                        dao.salvar(novoUsuario);
                    }

                    Toast.makeText(AddUserActivity.this,  "Tudo preenchido!!", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(AddUserActivity.this, MainActivity.class);
                    startActivity(i);
                    Toast.makeText(AddUserActivity.this, "Cadastro Concluído, agora faça login para acessar!!", Toast.LENGTH_SHORT).show();


                    finish();
                } else{

                    Toast.makeText(AddUserActivity.this,  "Preencha todos os campos!!", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
