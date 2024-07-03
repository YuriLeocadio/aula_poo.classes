package com.poo.classes;

public class Editora {
    private int editora_id;
    private String nome;
    private static int contador = 0;

    public Editora(String nome) {
        this.editora_id = contador++;
        this.nome = nome;
    }

    public int getEditora_id() {
        return editora_id;
    }

    public void setEditora_id(int editora_id) {
        this.editora_id = editora_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // Errei o commit
}


