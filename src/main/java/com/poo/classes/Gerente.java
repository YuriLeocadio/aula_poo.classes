package com.poo.classes;

public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, int endereco_id, String login, String senha, double salarioBase) {
        super(nome, cpf, endereco_id, login, senha, salarioBase);
    }

    @Override
    public void imprimeContraCheque() {
        System.out.println("Impressão de contracheque para Gerente:");
        System.out.println("Salário Base: " + getSalarioBase());

        double fgts = getSalarioBase() * 0.1;
        double inss = getSalarioBase() * 0.12;
        System.out.println("FGTS: " + fgts);
        System.out.println("INSS: " + inss);
    }

    @Override
    public boolean autentica(String login, String senha) {
        return this.getLogin().equals(login) && this.getSenha().equals(senha);
    }
}