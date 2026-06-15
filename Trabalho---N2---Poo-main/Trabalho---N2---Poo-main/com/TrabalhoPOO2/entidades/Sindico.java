
package com.TrabalhoPOO2.entidades;

public class Sindico extends UsuarioSistema {

    public Sindico(int id,
                   String nome,
                   String usuario,
                   String senha) {

        super(id, nome, usuario, senha);
    }

    @Override
    public void exibirPerfil() {

        System.out.println("Perfil: Síndico");
    }
}
