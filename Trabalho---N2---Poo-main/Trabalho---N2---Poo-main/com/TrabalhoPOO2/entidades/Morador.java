    package com.TrabalhoPOO2.entidades;

    public class Morador extends UsuarioSistema {

        private String cpf;
        private String telefone;

        public Morador(int id,
                       String nome,
                       String usuario,
                       String senha,
                       String cpf,
                       String telefone) {

            super(id, nome, usuario, senha);

            this.cpf = cpf;
            this.telefone = telefone;
        }

        @Override
        public void exibirPerfil() {

            System.out.println("Perfil: Morador");
        }

        public String getCpf() {
            return cpf;
        }

        public String getTelefone() {
            return telefone;
        }
    }