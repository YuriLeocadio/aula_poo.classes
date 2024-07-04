package com.poo.classes;

public abstract class Pessoa {
    private int pessoa_id;
    private String rg;
    private String cpf;
    private String nome;
    private int endereco_id;
    private static int contador = 0;

    public Pessoa(String nome, String cpf, int endereco_id) {
        this.pessoa_id = ++contador;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco_id = endereco_id;
    }

    public int getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(int endereco_id) {
        this.endereco_id = endereco_id;
    }

    // Método abstrato para autenticação
    public abstract boolean autentica(String login, String senha);
}
