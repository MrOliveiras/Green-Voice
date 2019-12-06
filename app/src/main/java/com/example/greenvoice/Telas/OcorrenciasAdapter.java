package com.example.greenvoice.Telas;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.greenvoice.Model.Ocorrencias;

import java.util.List;

import com.example.greenvoice.R;
import com.example.greenvoice.Model.Ocorrencias;

public class OcorrenciasAdapter extends BaseAdapter {

    private List<Ocorrencias> listaOcorrencias;
    private Context context;

    public OcorrenciasAdapter(List<Ocorrencias> listaOcorrencias, Context context) {
        this.listaOcorrencias = listaOcorrencias;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaOcorrencias.size();
    }

    @Override
    public Ocorrencias getItem(int position) {
        return listaOcorrencias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaOcorrencias.get(position).getCod_da_ocorrencia();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Ocorrencias ocorrencias = listaOcorrencias.get(position);

        View view = LayoutInflater.from(context).inflate(R.layout.item_contato, parent, false);
        TextView textViewTitulo = view.findViewById(R.id.titulo_ocorrencia);
        TextView textViewCategoria =  view.findViewById(R.id.categoria_ocorrencia);
        TextView textViewCidade =  view.findViewById(R.id.cidade_ocorrencia);
        TextView textViewData =  view.findViewById(R.id.data_ocorrencia);

        textViewTitulo.setText(ocorrencias.getTitulo());
        textViewCategoria.setText(ocorrencias.getCategoria_da_ocorrencia());
        String foto = ocorrencias.getImg_da_ocorrencia();

        ImageView image = view.findViewById(R.id.item_ocorrencia_img);
        Bitmap bitmap = BitmapFactory.decodeFile(foto);
        image.setImageBitmap(bitmap);
        image.setTag(foto);

       if(textViewCidade != null){
           textViewCidade.setText(ocorrencias.getCidade());
           textViewData.setText(ocorrencias.getData());
       }

        return view;

    }


    public void atualizar(List<Ocorrencias> listaOcorrencias) {

        this.listaOcorrencias.clear();
        this.listaOcorrencias.addAll(listaOcorrencias);
        notifyDataSetChanged();
    }


}
