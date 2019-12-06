package com.example.greenvoice.Banco;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.greenvoice.Model.Ocorrencias;

import java.util.ArrayList;
import java.util.List;

public class OcorrenciasDao extends Conexao {


    private String TABLE = "OCORRENCIA";

    private Context context;

    public OcorrenciasDao(Context context) {
        super(context);
        this.context = context;
    }

    public void salvar(Ocorrencias ocorrencias) {
        SQLiteDatabase db = getWritableDatabase();;
        ContentValues dadosDaOcorrencia = preencherDadosDaOcorrencia(ocorrencias);

        db.insert(TABLE, null, dadosDaOcorrencia);
        db.close();
    }
    public void remover(Ocorrencias ocorrencias) {
        SQLiteDatabase db = getWritableDatabase();
        String[] param = {String.valueOf(ocorrencias.getCod_da_ocorrencia())};
        db.delete(TABLE,"id = ?",param);
        db.close();
    }

    public void atualizar(Ocorrencias ocorrencias) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dadosDaOcorrencia = preencherDadosDaOcorrencia(ocorrencias);
        String[] param = {String.valueOf(ocorrencias.getCod_da_ocorrencia())};

        db.update(TABLE, dadosDaOcorrencia, "id = ?", param);

    }

    public List<Ocorrencias> listarOcorrencias() {
        List<Ocorrencias> list = new ArrayList<>();

        String sql = "SELECT * FROM OCORRENCIA;";
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        while (cursor.moveToNext()) {
            int cod_da_ocorrencia = cursor.getInt(cursor.getColumnIndex("ID"));
            String titulo = cursor.getString(cursor.getColumnIndex("TITULO"));
            String descricao = cursor.getString(cursor.getColumnIndex("DESCRICAO"));
            int position_categoria_da_ocorrencia = cursor.getInt(cursor.getColumnIndex("POSITION_TIPO"));
            String categoria_da_ocorrencia = cursor.getString(cursor.getColumnIndex("TIPO"));
            String img_da_ocorrencia = cursor.getString(cursor.getColumnIndex("IMG_DA_OCORRENCIA"));
            String cep = cursor.getString(cursor.getColumnIndex("CEP"));
            String rua = cursor.getString(cursor.getColumnIndex("RUA"));
            String cidade = cursor.getString(cursor.getColumnIndex("CIDADE"));
            String uf = cursor.getString(cursor.getColumnIndex("UF"));
            String data = cursor.getString(cursor.getColumnIndex("DATA"));
            String hora = cursor.getString(cursor.getColumnIndex("HORA"));

            list.add(new Ocorrencias(cod_da_ocorrencia, titulo, descricao, position_categoria_da_ocorrencia,
                    categoria_da_ocorrencia, img_da_ocorrencia, cep, rua, cidade, uf, data, hora));
        }

        //Encerrar e liberar o cursor
        cursor.close();
        db.close();

        return list;
    }

    private ContentValues preencherDadosDaOcorrencia(Ocorrencias ocorrencias) {

        ContentValues dadosDaOcorrencia = new ContentValues();

        dadosDaOcorrencia.put("TITULO", ocorrencias.getTitulo());
        dadosDaOcorrencia.put("DESCRICAO", ocorrencias.getDescricao());
        dadosDaOcorrencia.put("POSITION_TIPO", ocorrencias.getPosition_categoria_da_ocorrencia());
        dadosDaOcorrencia.put("TIPO", ocorrencias.getCategoria_da_ocorrencia());
        dadosDaOcorrencia.put("IMG_DA_OCORRENCIA", ocorrencias.getImg_da_ocorrencia());
        dadosDaOcorrencia.put("CIDADE", ocorrencias.getCidade());
        dadosDaOcorrencia.put("UF", ocorrencias.getUf());
        dadosDaOcorrencia.put("CEP", ocorrencias.getCep());
        dadosDaOcorrencia.put("DATA", ocorrencias.getData());
        dadosDaOcorrencia.put("HORA", ocorrencias.getHora());

        return dadosDaOcorrencia;
    }

}
