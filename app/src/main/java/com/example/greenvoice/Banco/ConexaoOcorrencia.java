package com.example.greenvoice.Banco;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexaoOcorrencia extends SQLiteOpenHelper {

    public ConexaoOcorrencia(Context context) {
        super(context, "LISTA_DE_OCORRENCIA", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE OCORRENCIA (ID INTEGER PRIMARY KEY, TITULO TEXT NOT NULL, DESCRICAO TEXT, POSITION_TIPO INTEGER, TIPO TEXT," +
                " IMG_DA_OCORRENCIA TEXT, CEP TEXT, RUA TEXT, CIDADE TEXT, UF TEXT);";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS OCORRENCIA";
        db.execSQL(sql);

        onCreate(db);
    }


}