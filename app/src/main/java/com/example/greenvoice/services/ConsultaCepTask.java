package com.example.greenvoice.services;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.EditText;

import com.example.greenvoice.R;
import com.example.greenvoice.Telas.AddOcorrenciaActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.ref.WeakReference;

public class ConsultaCepTask extends AsyncTask<String, Object, String> {

    private WeakReference<AddOcorrenciaActivity> reference;

    public ConsultaCepTask(Context context) {
        this.reference = new WeakReference<>((AddOcorrenciaActivity) context);
    }

    @Override
    protected String doInBackground(String... listaCep) {
        String cep = listaCep[0];

        WebClient client = new WebClient();
        String response = client.getCep(cep);

        System.out.println(response);

        return response;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        try {
            JSONObject json = new JSONObject(s);
            String rua = json.getString("logradouro");
            String cidade = json.getString("localidade");
            String uf = json.getString("uf");

            EditText etRua = reference.get().findViewById(R.id.et_rua);
            EditText etCidade = reference.get().findViewById(R.id.et_cidade);
            EditText etUF = reference.get().findViewById(R.id.et_uf);

            etRua.setText(rua);
            etCidade.setText(cidade);
            etUF.setText(uf);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
