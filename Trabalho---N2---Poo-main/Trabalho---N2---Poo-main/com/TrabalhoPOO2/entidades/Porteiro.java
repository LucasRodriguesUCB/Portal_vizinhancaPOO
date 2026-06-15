package com.TrabalhoPOO2.entidades;

public class Porteiro extends UsuarioSistema {

    public Porteiro(int id,
                    String nome,
                    String usuario,
                    String senha) {

        super(id, nome, usuario, senha);
    }

    @Override
    public void exibirPerfil() {

        System.out.println("Perfil: Porteiro");
    }
}
