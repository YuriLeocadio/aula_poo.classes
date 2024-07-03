package com.poo.classes;

public class Endereco {
    private String uf;
    private String cidade;
    private String tipo;
    private String logradouro;
    private String complemento;
    private int endereco_id;
    private String cep;
    private static int contador = 0;

    public Endereco(String cep) {
        this.endereco_id = contador++;
        this.cep = cep;
    }

    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getuf() {
        return uf;
    }

    public void setuf(String uf) {
        this.uf = uf;
    }

    public String getcidade() {
        return cidade;
    }

    public void setcidade(String cidade) {
        this.cidade = cidade;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public String getlogradouro() {
        return logradouro;
    }

    public void setlogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getcomplemento() {
        return complemento;
    }

    public void setcomplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getendereco_id() {
        return endereco_id;
    }

    public void setendereco_id(int endereco_id) {
        this.endereco_id = endereco_id;
    }
}

