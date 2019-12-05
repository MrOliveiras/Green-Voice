package com.example.greenvoice.Banco;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.example.greenvoice.Contatos.Usuario;

public class UsuarioDao {

    private ConexaoUser conn;
    private String TABLE = "USUARIO";

    public UsuarioDao(Context context) {
        conn = new ConexaoUser(context);
    }

    public void salvar(Usuario usuario) {
        SQLiteDatabase db = conn.getWritableDatabase(); //Metodo para abrir uma conexao
        ContentValues dados = preencherDados(usuario);

        db.insert(TABLE, null, dados);
        db.close();
    }


    public void atualizar(Usuario usuario) {
        SQLiteDatabase db = conn.getWritableDatabase();
        ContentValues dados = preencherDados(usuario);
        String[] param = {String.valueOf(usuario.getCodUsuario())};

        db.update(TABLE,dados,"id = ?",param);
        db.close();
    }

    private ContentValues preencherDados(Usuario usuario) {

        ContentValues dados = new ContentValues();
        dados.put("NOME_COMPLETO", usuario.getNomeCompleto());
        dados.put("NOME_DE_USUARIO", usuario.getUser());
        dados.put("TELEFONE", usuario.getTelefone());
        dados.put("EMAIL_DE_USUARIO", usuario.getEmail());
        dados.put("SENHA_DE_USUARIO", usuario.getSenha());

        return dados;
    }
}
