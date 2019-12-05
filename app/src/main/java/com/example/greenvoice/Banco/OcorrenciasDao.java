package com.example.greenvoice.Banco;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.example.greenvoice.Contatos.Ocorrencias;

public class OcorrenciasDao {


    private ConexaoUsuario conn;
    private String TABLE = "OCORRENCIAS";

    public OcorrenciasDao(Context context) {
        conn = new ConexaoUsuario(context);
    }

    public void salvar(Ocorrencias ocorrencias) {
        SQLiteDatabase db = conn.getWritableDatabase();;
        ContentValues dadosDaOcorrencia = preencherDadosDaOcorrencia(ocorrencias);

        db.insert(TABLE, null, dadosDaOcorrencia);
        db.close();
    }
    public void remover(Ocorrencias ocorrencias) {
        SQLiteDatabase db = conn.getWritableDatabase();
        String[] param = {String.valueOf(ocorrencias.getCod_da_ocorrencia())};
        db.delete(TABLE,"id = ?",param);
        db.close();
    }

    public void atualizar(Ocorrencias ocorrencias) {
        SQLiteDatabase db = conn.getWritableDatabase();
        ContentValues dadosDaOcorrencia = preencherDadosDaOcorrencia(ocorrencias);
        String[] param = {String.valueOf(ocorrencias.getCod_da_ocorrencia())};

        db.update(TABLE, dadosDaOcorrencia, "id = ?", param);

    }
        private ContentValues preencherDadosDaOcorrencia(Ocorrencias ocorrencias) {

            ContentValues dadosDaOcorrencia = new ContentValues();

            dadosDaOcorrencia.put("TITULO", ocorrencias.getTitulo());
            dadosDaOcorrencia.put("DESCRICAO", ocorrencias.getDescricao());
            dadosDaOcorrencia.put("TIPO_DE_OCORRENCIA", ocorrencias.getTipo_de_ocorrencia());
            dadosDaOcorrencia.put("IMG_DA_OCORRENCIA", ocorrencias.getImg_da_ocorrencia());
            dadosDaOcorrencia.put("CIDADE", ocorrencias.getCidade());
            dadosDaOcorrencia.put("UF", ocorrencias.getUf());
            dadosDaOcorrencia.put("CEP", ocorrencias.getCep());

        return dadosDaOcorrencia;
    }

}
