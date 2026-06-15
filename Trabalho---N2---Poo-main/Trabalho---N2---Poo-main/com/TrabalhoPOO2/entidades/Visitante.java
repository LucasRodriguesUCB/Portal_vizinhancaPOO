package com.TrabalhoPOO2.entidades;

public class Visitante {

    private int id;
    private String nome;
    private String documento;
    private Unidade unidadeVisitada;

    public Visitante(int id,
                      String nome,
                      String documento,
                      Unidade unidadeVisitada) {

        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.unidadeVisitada = unidadeVisitada;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public Unidade getUnidadeVisitada() {
        return unidadeVisitada;
    }
}