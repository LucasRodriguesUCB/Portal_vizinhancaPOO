package com.TrabalhoPOO2.entidades;

import com.TrabalhoPOO2.contratos.Autenticavel;

public abstract class UsuarioSistema implements Autenticavel {

    protected int id;
    protected String nome;
    protected String usuario;
    protected String senha;

    public UsuarioSistema(int id,
                          String nome,
                          String usuario,
                          String senha) {

        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public boolean realizarLogin(String usuario, String senha) {

        return this.usuario.equals(usuario)
                && this.senha.equals(senha);
    }

    public String getNome() {
        return nome;
    }

    public abstract void exibirPerfil();
}