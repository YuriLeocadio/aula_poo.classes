package com.poo.classes;

public class Autor {
    private int autor_id;
    private String nome;
    private static int contador = 0;

    public Autor(String nome) {
        this.autor_id = contador++;
        this.nome = nome;
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


