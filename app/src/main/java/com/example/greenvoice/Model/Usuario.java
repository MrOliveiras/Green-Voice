package com.example.greenvoice.Model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String NomeCompleto;
    private int codUsuario;
    private String user;
    private String telefone;
    private String email;
    private String senha;


    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        NomeCompleto = nomeCompleto;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(String nomeCompleto, int codUsuario, String user, String telefone, String email, String senha) {
        NomeCompleto = nomeCompleto;
        this.codUsuario = codUsuario;
        this.user = user;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String nomeCompleto, String user, String telefone, String email, String senha) {
        NomeCompleto = nomeCompleto;
        this.codUsuario = 0;
        this.user = user;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "NomeCompleto='" + NomeCompleto + '\'' +
                ", codUsuario=" + codUsuario +
                ", user='" + user + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
