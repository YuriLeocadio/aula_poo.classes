package com.poo.classes;

import java.time.LocalDate;

public class Devolucao {
    private LocalDate data_devolvido = LocalDate.now();
    private int devolucao_id;

    public LocalDate getData_devolvido() {
        return data_devolvido;
    }

    public void setData_devolvido(LocalDate data_devolvido) {
        this.data_devolvido = data_devolvido;
    }

    public int getDevolucao_id() {
        return devolucao_id;
    }

    public void setDevolucao_id(int devolucao_id) {
        this.devolucao_id = devolucao_id;
    }
    // escrevi o commit errado
}

