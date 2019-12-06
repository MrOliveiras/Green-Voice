package com.example.greenvoice.Banco;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;


import com.example.greenvoice.Model.Usuario;

import java.util.ArrayList;

public class UsuarioDao extends Conexao {

    private Context context;
    private String TABLE = "USUARIO";

    public UsuarioDao(Context context) {
        super(context);
        this.context = context;
    }

    public void salvar(Usuario usuario) {
        SQLiteDatabase db = getWritableDatabase();
        try {
            ContentValues dados = preencherDados(usuario);

            db.insert(TABLE, null, dados);
        }
        catch(SQLiteException e) {
        }
        db.close();
    }


    public void atualizar(Usuario usuario) {
        SQLiteDatabase db = getWritableDatabase();
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
    public ArrayList<Usuario> recuperarTudo() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            Cursor cursor = getWritableDatabase().rawQuery("SELECT * FROM USUARIO;", null);

            while(cursor.moveToNext()) {
                usuarios.add(new Usuario(
                        cursor.getString(cursor.getColumnIndex("NOME_COMPLETO")),
                        cursor.getInt(cursor.getColumnIndex("ID")),
                        cursor.getString(cursor.getColumnIndex("NOME_DE_USUARIO")),
                        cursor.getString(cursor.getColumnIndex("TELEFONE")),
                        cursor.getString(cursor.getColumnIndex("EMAIL_DE_USUARIO")),
                        cursor.getString(cursor.getColumnIndex("SENHA_DE_USUARIO"))
                ));

            }
        }
        catch(SQLiteException e) {

        }

        return usuarios;
    }


    public Usuario recuperarUsuario(String usuario, String senha) {
        Usuario usu = null;

        try {
            String[] argumentos = { usuario, senha };
            Cursor cursor = getWritableDatabase().rawQuery("SELECT * FROM USUARIO WHERE NOME_DE_USUARIO=? AND SENHA_DE_USUARIO=?", argumentos);

            while(cursor.moveToNext()) {
                usu = new Usuario(
                        cursor.getString(cursor.getColumnIndex("NOME_COMPLETO")),
                        cursor.getInt(cursor.getColumnIndex("ID")),
                        cursor.getString(cursor.getColumnIndex("NOME_DE_USUARIO")),
                        cursor.getString(cursor.getColumnIndex("TELEFONE")),
                        cursor.getString(cursor.getColumnIndex("EMAIL_DE_USUARIO")),
                        cursor.getString(cursor.getColumnIndex("SENHA_DE_USUARIO"))
                );

            }
        }
        catch(SQLiteException e) {
        }

        return usu;
    }
}
