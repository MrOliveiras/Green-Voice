package com.example.greenvoice.Contatos;

import java.io.Serializable;

public class Ocorrencias implements Serializable {

    private String titulo;
    private String cod_da_ocorrencia;
    private String descricao;
<<<<<<< HEAD
    private String categoria_da_ocorrencia;
=======
    private String tipo_de_ocorrencia;
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
    private String img_da_ocorrencia;
    private String cep;
    private String rua;
    private String cidade;
    private String uf;
<<<<<<< HEAD
    private String data;
    private String hora;
=======
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd

    public String getCod_da_ocorrencia() {
        return cod_da_ocorrencia;
    }

    public void setCod_da_ocorrencia(String cod_da_ocorrencia) {
        this.cod_da_ocorrencia = cod_da_ocorrencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

<<<<<<< HEAD
    public String getCategoria_da_ocorrencia() {
        return categoria_da_ocorrencia;
    }

    public void setCategoria_da_ocorrencia(String categoria_da_ocorrencia) {
        this.categoria_da_ocorrencia = categoria_da_ocorrencia;
=======
    public String getTipo_de_ocorrencia() {
        return tipo_de_ocorrencia;
    }

    public void setTipo_de_ocorrencia(String tipo_de_ocorrencia) {
        this.tipo_de_ocorrencia = tipo_de_ocorrencia;
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
    }

    public String getImg_da_ocorrencia() {
        return img_da_ocorrencia;
    }

    public void setImg_da_ocorrencia(String img_da_ocorrencia) {
        this.img_da_ocorrencia = img_da_ocorrencia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

<<<<<<< HEAD
    public String getData() { return data; }

    public void setData(String data) { this.data = data; }

    public String getHora() { return hora; }

    public void setHora(String hora) { this.hora = hora; }

    public Ocorrencias(String titulo, String cod_da_ocorrencia, String descricao, String categoria_da_ocorrencia, String img_da_ocorrencia, String cep, String rua, String cidade, String uf, String data, String hora) {
        this.titulo = titulo;
        this.cod_da_ocorrencia = cod_da_ocorrencia;
        this.descricao = descricao;
        this.categoria_da_ocorrencia = categoria_da_ocorrencia;
=======
    public Ocorrencias(String titulo, String cod_da_ocorrencia, String descricao, String tipo_de_ocorrencia, String img_da_ocorrencia, String cep, String rua, String cidade, String uf) {
        this.titulo = titulo;
        this.cod_da_ocorrencia = cod_da_ocorrencia;
        this.descricao = descricao;
        this.tipo_de_ocorrencia = tipo_de_ocorrencia;
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
        this.img_da_ocorrencia = img_da_ocorrencia;
        this.cep = cep;
        this.rua = rua;
        this.cidade = cidade;
        this.uf = uf;
<<<<<<< HEAD
        this.data = data;
        this.hora = hora;
=======
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
    }

    @Override
    public String toString() {
        return "Ocorrencias{" +
                "titulo='" + titulo + '\'' +
                ", cod_da_ocorrencia='" + cod_da_ocorrencia + '\'' +
                ", descricao='" + descricao + '\'' +
<<<<<<< HEAD
                ", categoria_da_ocorrencia='" + categoria_da_ocorrencia + '\'' +
=======
                ", tipo_de_ocorrencia='" + tipo_de_ocorrencia + '\'' +
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
                ", img_da_ocorrencia='" + img_da_ocorrencia + '\'' +
                ", cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
<<<<<<< HEAD
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
=======
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
                '}';
    }
}
