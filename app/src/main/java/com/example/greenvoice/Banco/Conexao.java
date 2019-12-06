package com.example.greenvoice.Banco;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {

    private Context context;

    public Conexao(Context context) {
        super(context, "CAD_OCORRENCIAS", null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE USUARIO (ID INTEGER PRIMARY KEY, NOME_COMPLETO NOT NULL, NOME_DE_USUARIO TEXT NOT NULL, TELEFONE TEXT, EMAIL_DE_USUARIO TEXT," +
                " SENHA_DE_USUARIO TEXT);";
        db.execSQL(sql);

        sql = "CREATE TABLE OCORRENCIA (ID INTEGER PRIMARY KEY AUTOINCREMENT, TITULO TEXT NOT NULL, DESCRICAO TEXT, POSITION_TIPO INTEGER, TIPO TEXT," +
                " IMG_DA_OCORRENCIA TEXT, CEP TEXT, RUA TEXT, CIDADE TEXT, UF TEXT, DATA TEXT, HORA TEXT);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE OCORRENCIA");
        sqLiteDatabase.execSQL("DROP TABLE USUARIO");
        this.onCreate(sqLiteDatabase);
    }
}
