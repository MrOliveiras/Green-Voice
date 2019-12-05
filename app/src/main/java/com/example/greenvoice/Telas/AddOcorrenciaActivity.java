package com.example.greenvoice.Telas;


import android.Manifest;
<<<<<<< HEAD
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
=======
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
>>>>>>> a88d9ad5a56b8607e5682fbea35fbf0265ef6e2e
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
<<<<<<< HEAD
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import com.example.greenvoice.Banco.OcorrenciasDao;
import com.example.greenvoice.BuildConfig;
import com.example.greenvoice.Contatos.Ocorrencias;
import com.example.greenvoice.R;
import com.example.greenvoice.services.ConsultaCepTask;

import java.io.File;
=======
import androidx.appcompat.app.AppCompatActivity;
import com.example.greenvoice.R;
>>>>>>> a88d9ad5a56b8607e5682fbea35fbf0265ef6e2e

public class AddOcorrenciaActivity extends AppCompatActivity implements OnItemSelectedListener {

    private static final int IMAGE_PICK_CODE = 1000;
    private static final int PERMISSION_CODE = 1001;

<<<<<<< HEAD
    private String caminhoFoto;
    public static final int REQUEST_CODE_CAMERA = 123;

    private EditText etTitulo;
    private EditText etDescricao;
    private Spinner sp;
    private EditText etCep;
    private EditText etRua;
    private EditText etCidade;
    private EditText etUf;
    private EditText etData;
    private EditText etHora;
=======
    private Spinner sp;

>>>>>>> a88d9ad5a56b8607e5682fbea35fbf0265ef6e2e

    private ImageView imagem_evidencia;
    private Button botao_escolher_imagem;
    private Button botao_enviar_denuncia;
<<<<<<< HEAD
    private Button botao_cep;

    private AlertDialog galeria_ou_camera;

    private int x = 0;

    private Ocorrencias ocorrencias;
=======
>>>>>>> a88d9ad5a56b8607e5682fbea35fbf0265ef6e2e

    @Override
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.add_ocorrencia);

        sp = (Spinner)findViewById(R.id.spinner_categorias);


<<<<<<< HEAD
        imagem_evidencia = findViewById(R.id.imagem_evidencia);
        botao_escolher_imagem = findViewById(R.id.botaoEscolherImagem);
        botao_cep = findViewById(R.id.botao_cep);
=======
        imagem_evidencia = findViewById(R.id.imagem_evidência);
        botao_escolher_imagem = findViewById(R.id.botaoEscolherImagem);
>>>>>>> a88d9ad5a56b8607e5682fbea35fbf0265ef6e2e
        botao_enviar_denuncia = findViewById(R.id.botaoEnviarDenuncia);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categorias, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(this);

<<<<<<< HEAD
        botao_escolher_imagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                galeriaOuCamera();
            }
        });

        botao_cep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etCep = findViewById(R.id.et_cep);
                String cep = etCep.getText().toString();
                ConsultaCepTask task = new ConsultaCepTask(AddOcorrenciaActivity.this);
                task.execute(cep);
            }
        });

        Intent intent = getIntent();
        if (intent.hasExtra("ocorrencia")) {
            etTitulo = findViewById(R.id.etTituloDenuncia);
            etDescricao = findViewById(R.id.etDescricaoDenuncia);
            sp = findViewById(R.id.spinner_categorias);
            imagem_evidencia = findViewById(R.id.imagem_evidencia);
            etCep = findViewById(R.id.et_cep);
            etRua = findViewById(R.id.et_rua);
            etCidade = findViewById(R.id.et_cidade);
            etUf = findViewById(R.id.et_uf);
            etData = findViewById(R.id.et_data);
            etHora = findViewById(R.id.et_hora);

            ocorrencias = (Ocorrencias) intent.getSerializableExtra("ocorrencia");

            etTitulo.setText(ocorrencias.getTitulo());
            etDescricao.setText(ocorrencias.getDescricao());
            sp.setSelection(ocorrencias.getPosition_categoria_da_ocorrencia());
            setImage(ocorrencias.getImg_da_ocorrencia());
            etCep.setText(ocorrencias.getCep());
            etRua.setText(ocorrencias.getRua());
            etCidade.setText(ocorrencias.getCidade());
            etUf.setText(ocorrencias.getUf());
            etData.setText(ocorrencias.getData());
            etHora.setText(ocorrencias.getHora());
        }

        botao_enviar_denuncia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTitulo = findViewById(R.id.etTituloDenuncia);
                etDescricao = findViewById(R.id.etDescricaoDenuncia);
                sp = findViewById(R.id.spinner_categorias);
                imagem_evidencia = findViewById(R.id.imagem_evidencia);
                etCep = findViewById(R.id.et_cep);
                etRua = findViewById(R.id.et_rua);
                etCidade = findViewById(R.id.et_cidade);
                etUf = findViewById(R.id.et_uf);
                etData = findViewById(R.id.et_data);
                etHora = findViewById(R.id.et_hora);

                String titulo = etTitulo.getText().toString();
                String descricao = etDescricao.getText().toString();
                int position_categoria = sp.getSelectedItemPosition();
                String categoria = sp.getSelectedItem().toString();
                String foto = imagem_evidencia.getTag().toString();
                String cep = etCep.getText().toString();
                String rua = etRua.getText().toString();
                String cidade = etCidade.getText().toString();
                String uf = etUf.getText().toString();
                String data = etData.getText().toString();
                String hora = etHora.getText().toString();
                OcorrenciasDao dao = new OcorrenciasDao(AddOcorrenciaActivity.this);

                Intent intent = getIntent();
                if (intent.hasExtra("ocorrencia")) {
                    ocorrencias = (Ocorrencias) intent.getSerializableExtra("ocorrencia");

                    etTitulo.setText(ocorrencias.getTitulo());
                    etDescricao.setText(ocorrencias.getDescricao());
                    sp.setSelection(ocorrencias.getPosition_categoria_da_ocorrencia());
                    setImage(ocorrencias.getImg_da_ocorrencia());
                    etCep.setText(ocorrencias.getCep());
                    etRua.setText(ocorrencias.getRua());
                    etCidade.setText(ocorrencias.getCidade());
                    etUf.setText(ocorrencias.getUf());
                    etData.setText(ocorrencias.getData());
                    etHora.setText(ocorrencias.getHora());

                    dao.atualizar(ocorrencias);
                    System.out.println(ocorrencias.getCod_da_ocorrencia() + " " + ocorrencias.toString());
                } else {
                    ocorrencias = new Ocorrencias(titulo, descricao, position_categoria, categoria, foto, cep, rua, cidade, uf, data, hora);
                    dao.salvar(ocorrencias);
                }
                finish();
            }
        });

=======



        botao_escolher_imagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                            == PackageManager.PERMISSION_DENIED) {
                        String[] permissions = {Manifest.permission.READ_EXTERNAL_STORAGE};
                        requestPermissions(permissions, PERMISSION_CODE);
                    } else {
                        pickImageFromGallery();
                    }
                } else {
                    pickImageFromGallery();
                }
            }
        });

        botao_enviar_denuncia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddOcorrenciaActivity.this, ListaDeOcorrenciasActivity.class);
                startActivity(intent);
            }
        });
>>>>>>> a88d9ad5a56b8607e5682fbea35fbf0265ef6e2e
    }

    private void pickImageFromGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, IMAGE_PICK_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    pickImageFromGallery();
                } else {
                    Toast.makeText(this, "Permissão não concedida...!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
<<<<<<< HEAD
        super.onActivityResult(requestCode, resultCode, data);
        if (x == 1) {
            if (resultCode == RESULT_OK && requestCode == IMAGE_PICK_CODE) {
                imagem_evidencia.setImageURI(data.getData());
            }
        } else if (x == 2) {
            setImage(caminhoFoto);
=======
        if (resultCode == RESULT_OK && requestCode == IMAGE_PICK_CODE) {
            imagem_evidencia.setImageURI(data.getData());
>>>>>>> a88d9ad5a56b8607e5682fbea35fbf0265ef6e2e
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //String text = parent.getItemAtPosition(position).toString();
        //Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
<<<<<<< HEAD

    private void galeriaOuCamera() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Definir imagem");
        builder.setMessage("Escolha de onde será definida a sua imagem de evidência:");
        builder.setPositiveButton("Galeria", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                x = 1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                            == PackageManager.PERMISSION_DENIED) {
                        String[] permissions = {Manifest.permission.READ_EXTERNAL_STORAGE};
                        requestPermissions(permissions, PERMISSION_CODE);
                    } else {
                        pickImageFromGallery();
                    }
                } else {
                    pickImageFromGallery();
                }
            }
        });
        builder.setNegativeButton("Câmera", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                x = 2;
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                caminhoFoto = getExternalFilesDir(null) + "/" + System.currentTimeMillis() + "jpg";
                File file = new File(caminhoFoto);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, FileProvider.getUriForFile(
                        AddOcorrenciaActivity.this, BuildConfig.APPLICATION_ID + ".provider", file
                ));
                startActivityForResult(intent, 123);
            }
        });
        galeria_ou_camera = builder.create();
        galeria_ou_camera.show();
    }

    private void setImage(String foto) {
        ImageView imageView = findViewById(R.id.imagem_evidencia);
        Bitmap bitmap = BitmapFactory.decodeFile(foto);
        imageView.setImageBitmap(bitmap);
        imageView.setTag(foto);
    }

=======
>>>>>>> a88d9ad5a56b8607e5682fbea35fbf0265ef6e2e
}
