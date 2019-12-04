package com.example.greenvoice.Contatos;

import java.io.Serializable;

public class Usuario implements Serializable {

<<<<<<< HEAD
    private String nomeCompleto;
=======
    private String NomeCompleto;
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
    private int codUsuario;
    private String user;
    private String telefone;
    private String email;
    private String senha;


    public String getNomeCompleto() {
<<<<<<< HEAD
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        nomeCompleto = nomeCompleto;
=======
        return NomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        NomeCompleto = nomeCompleto;
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
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
<<<<<<< HEAD
        this.nomeCompleto = nomeCompleto;
=======
        NomeCompleto = nomeCompleto;
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
        this.codUsuario = codUsuario;
        this.user = user;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
<<<<<<< HEAD
                "NomeCompleto='" + nomeCompleto + '\'' +
=======
                "NomeCompleto='" + NomeCompleto + '\'' +
>>>>>>> 00f5dd96318d55e41a3a63799903dfe03d105dfd
                ", codUsuario=" + codUsuario +
                ", user='" + user + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
