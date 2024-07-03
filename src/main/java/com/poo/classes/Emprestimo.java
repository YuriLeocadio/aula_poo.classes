package com.poo.classes;

import java.time.LocalDate;

public class Emprestimo {
    private int emprestimo_id;
    private LocalDate data_emprestimo = LocalDate.now();
    private LocalDate data_prev_dev;
    private int pessoa_id;
    private static int contador = 0;

    public Emprestimo(LocalDate data_emprestimo, LocalDate data_prev_dev, int pessoa_id) {
        this.emprestimo_id = contador++;
        this.data_emprestimo = data_emprestimo;
        this.data_prev_dev = data_prev_dev;
        this.pessoa_id = pessoa_id;
    }

    public int getEmprestimo_id() {
        return emprestimo_id;
    }

    public void setEmprestimo_id(int emprestimo_id) {
        this.emprestimo_id = emprestimo_id;
    }

    public LocalDate getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(LocalDate data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public LocalDate getData_prev_dev() {
        return data_prev_dev;
    }

    public void setData_prev_dev(LocalDate data_prev_dev) {
        this.data_prev_dev = data_prev_dev;
    }

    public int getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }
}


