package com.example.greenvoice.Telas;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
<<<<<<< HEAD
import android.widget.Toast;

=======
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
import androidx.appcompat.app.AppCompatActivity;
import com.example.greenvoice.Banco.UsuarioDao;
import com.example.greenvoice.Contatos.Usuario;
import com.example.greenvoice.R;

public class AddUserActivity extends AppCompatActivity {

<<<<<<< HEAD
    private EditText etNome;
    private EditText etNomeDeUsuario1;
    private EditText etTelefoneDoUsuario;
    private EditText etEmailDoUsuario;
    private EditText etSenha;

    private Usuario usuario;

=======
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.add_user_view);

<<<<<<< HEAD
        etNome = findViewById(R.id.etNome);
        etNomeDeUsuario1 = findViewById(R.id.etNomeDeUsuario1);
        etTelefoneDoUsuario = findViewById(R.id.etTelefoneDoUsuario);
        etEmailDoUsuario = findViewById(R.id.etEmailDoUsuario);
        etSenha = findViewById(R.id.etSenha);

        Intent intent = getIntent();
        if(intent.hasExtra("usuario")) {
            usuario = (Usuario) intent.getSerializableExtra("usuario");
=======

        Intent intent = getIntent();
        if(intent.hasExtra("usuario")) {
            EditText etNome = findViewById(R.id.etNome);
            EditText etNomeDeUsuario1 = findViewById(R.id.etNomeDeUsuario1);
            EditText etTelefoneDoUsuario = findViewById(R.id.etTelefoneDoUsuario);
            EditText etEmailDoUsuario = findViewById(R.id.etEmailDoUsuario);
            EditText etSenha = findViewById(R.id.etSenha);

            Usuario usuario = (Usuario) intent.getSerializableExtra("usuario");
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd

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

<<<<<<< HEAD
=======
                EditText etNome = findViewById(R.id.etNome);
                EditText etNomeDeUsuario1 = findViewById(R.id.etNomeDeUsuario1);
                EditText etTelefoneDoUsuario = findViewById(R.id.etTelefoneDoUsuario);
                EditText etEmailDoUsuario = findViewById(R.id.etEmailDoUsuario);
                EditText etSenha = findViewById(R.id.etSenha);


>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
                String nomeCompleto = etNome.getText().toString();
                String nome_de_usuario = etNomeDeUsuario1.getText().toString();
                String telefone_de_usuario = etTelefoneDoUsuario.getText().toString();
                String email_de_usuario = etEmailDoUsuario.getText().toString();
                String senha_de_usuario = etSenha.getText().toString();

<<<<<<< HEAD
                Usuario novoUsuario = new Usuario(nomeCompleto, 0, nome_de_usuario,
                        telefone_de_usuario, email_de_usuario, senha_de_usuario);
=======
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd

                UsuarioDao dao = new UsuarioDao(AddUserActivity.this);

                Intent intent = getIntent();
                if(intent.hasExtra("usuario")) {
<<<<<<< HEAD
                    novoUsuario.setCodUsuario(usuario.getCodUsuario());

                    dao.atualizar(novoUsuario);

                    System.out.println(novoUsuario.getCodUsuario()  + " " + novoUsuario.toString());

                } else {
                    dao.salvar(novoUsuario);
=======
                    Usuario usuario = (Usuario) intent.getSerializableExtra("usuario");
                    //n sei pq aqui ta dando erro  ;-;

                    usuario.getNomeCompleto(nomeCompleto);
                    usuario.getUser(nome_de_usuario);
                    usuario.getTelefone(telefone_de_usuario);
                    usuario.getEmail(email_de_usuario);
                    usuario.getSenha(senha_de_usuario);

                    dao.atualizar(usuario);
                    System.out.println(usuario.getCodUsuario()  + " " + usuario.toString());


                } else {
                    // e aqui tbm ;=;
                    Usuario usuario = new Usuario(nomeCompleto,nome_de_usuario,telefone_de_usuario,email_de_usuario,senha_de_usuario);
                    dao.salvar(usuario);
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
                }

                finish();

<<<<<<< HEAD
                Toast.makeText(AddUserActivity.this, "Usuário cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(AddUserActivity.this, MainActivity.class);
                 startActivity(i);

=======
                 Intent i = new Intent(AddUserActivity.this, ActivityOpcao.class);
                 startActivity(intent);
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd

            }
        });
    }
}
