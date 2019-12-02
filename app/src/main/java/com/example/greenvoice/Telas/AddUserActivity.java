package com.example.greenvoice.Telas;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.greenvoice.Banco.UsuarioDao;
import com.example.greenvoice.Contatos.Usuario;
import com.example.greenvoice.R;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.add_user_view);


        Intent intent = getIntent();
        if(intent.hasExtra("usuario")) {
            EditText etNome = findViewById(R.id.etNome);
            EditText etNomeDeUsuario1 = findViewById(R.id.etNomeDeUsuario1);
            EditText etTelefoneDoUsuario = findViewById(R.id.etTelefoneDoUsuario);
            EditText etEmailDoUsuario = findViewById(R.id.etEmailDoUsuario);
            EditText etSenha = findViewById(R.id.etSenha);

            Usuario usuario = (Usuario) intent.getSerializableExtra("usuario");

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

                EditText etNome = findViewById(R.id.etNome);
                EditText etNomeDeUsuario1 = findViewById(R.id.etNomeDeUsuario1);
                EditText etTelefoneDoUsuario = findViewById(R.id.etTelefoneDoUsuario);
                EditText etEmailDoUsuario = findViewById(R.id.etEmailDoUsuario);
                EditText etSenha = findViewById(R.id.etSenha);


                String nomeCompleto = etNome.getText().toString();
                String nome_de_usuario = etNomeDeUsuario1.getText().toString();
                String telefone_de_usuario = etTelefoneDoUsuario.getText().toString();
                String email_de_usuario = etEmailDoUsuario.getText().toString();
                String senha_de_usuario = etSenha.getText().toString();


                UsuarioDao dao = new UsuarioDao(AddUserActivity.this);

                Intent intent = getIntent();
                if(intent.hasExtra("usuario")) {
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
                }

                finish();

                 Intent i = new Intent(AddUserActivity.this, ActivityOpcao.class);
                 startActivity(intent);

            }
        });
    }
}
