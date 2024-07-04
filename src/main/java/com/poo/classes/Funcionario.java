package com.poo.classes;

public abstract class Funcionario extends Pessoa {
    private String login;
    private String senha;
    private double salarioBase;

    public Funcionario(String nome, String cpf, int endereco_id, String login, String senha, double salarioBase) {
        super(nome, cpf, endereco_id);
        this.login = login;
        this.senha = senha;
        this.salarioBase = salarioBase;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método abstrato para imprimir contracheque com FGTS e INSS
    public abstract void imprimeContraCheque();

    // Método abstrato para autenticação
    public abstract boolean autentica(String login, String senha);
}
