package com.poo.classes;

public class Pessoa {
    private int pessoa_id;
    private String rg;
    private String cpf;
    private String nome;
    private int endereco_id;

    public int getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

    public String getrg() {
        return rg;
    }

    public void setrg(String rg) {
        this.rg = rg;
    }

    public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int getendereco_id() {
        return endereco_id;
    }

    public void setendereco_id(int endereco_id) {
        this.endereco_id = endereco_id;
    }
}


