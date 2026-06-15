package com.TrabalhoPOO2.regras;

import com.TrabalhoPOO2.entidades.UsuarioSistema;

public class GerenciadorLogin {

    public boolean autenticar(UsuarioSistema usuario,
                              String login,
                              String senha) {

        return usuario.realizarLogin(login, senha);
    }
}
