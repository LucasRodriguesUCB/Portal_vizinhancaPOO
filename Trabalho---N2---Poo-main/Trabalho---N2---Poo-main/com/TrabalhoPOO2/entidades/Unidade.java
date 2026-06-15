package com.TrabalhoPOO2.entidades;

public class Unidade {

    private int id;
    private String bloco;
    private int numero;

    public Unidade(int id,
                   String bloco,
                   int numero) {

        this.id = id;
        this.bloco = bloco;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public String getBloco() {
        return bloco;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {

        return "Bloco " + bloco +
               " - Unidade " + numero;
    }
}