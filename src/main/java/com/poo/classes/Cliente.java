package com.poo.classes;

public class Cliente extends Pessoa {
    public Cliente(String nome, String cpf, int endereco_id) {
        super(nome, cpf, endereco_id);
    }
    @Override
    public boolean autentica(String login, String senha) {

        return false;
    }
}
