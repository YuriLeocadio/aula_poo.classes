package com.poo.classes;

public class Atendente extends Funcionario {
    public Atendente(String nome, String cpf, int endereco_id, String login, String senha, double salarioBase) {
        super(nome, cpf, endereco_id, login, senha, salarioBase);
    }

    @Override
    public void imprimeContraCheque() {
        System.out.println("Impressão de contracheque para Atendente:");
        System.out.println("Salário Base: " + getSalarioBase());

        double fgts = getSalarioBase() * 0.08;
        double inss = getSalarioBase() * 0.11;
        System.out.println("FGTS: " + fgts);
        System.out.println("INSS: " + inss);
    }
    @Override
    public boolean autentica(String login, String senha) {
        return this.getLogin().equals(login) && this.getSenha().equals(senha);
    }
}