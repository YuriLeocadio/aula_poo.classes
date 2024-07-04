package com.poo.classes;

import java.time.LocalDate;

public class Devolucao {
    private LocalDate data_devolvido = LocalDate.now();
    private int devolucao_id;
    private static int contador = 0;

    public Devolucao(LocalDate data_devolvido) {
        this.devolucao_id = contador++;
        this.data_devolvido = data_devolvido;
    }

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
}

