package com.example.greenvoice.Banco;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexaoUsuario extends SQLiteOpenHelper {

    public ConexaoUsuario(Context context) {
        super(context, "LISTA_DE_USUARIO", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE USUARIO (ID INTEGER PRIMARY KEY, NOME_COMPLETO NOT NULL, NOME_DE_USUARIO TEXT NOT NULL, TELEFONE TEXT, EMAIL_DE_USUARIO TEXT," +
                " SENHA_DE_USUARIO TEXT);";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS USUARIO";
        db.execSQL(sql);
        onCreate(db);
    }



}
