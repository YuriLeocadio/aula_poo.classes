package com.poo.classes;

public class ExemplarEmprestimo {
    private int exemplar_emprestimo_id;
    private int exemplar_id;
    private int emprestimo_id;
    private int devolucao_id;

    public int getExemplar_emprestimo_id() {
        return exemplar_emprestimo_id;
    }

    public void setExemplar_emprestimo_id(int exemplar_emprestimo_id) {
        this.exemplar_emprestimo_id = exemplar_emprestimo_id;
    }

    public int getExemplar_id() {
        return exemplar_id;
    }

    public void setExemplar_id(int exemplar_id) {
        this.exemplar_id = exemplar_id;
    }

    public int getEmprestimo_id() {
        return emprestimo_id;
    }

    public void setEmprestimo_id(int emprestimo_id) {
        this.emprestimo_id = emprestimo_id;
    }

    public int getDevolucao_id() {
        return devolucao_id;
    }

    public void setDevolucao_id(int devolucao_id) {
        this.devolucao_id = devolucao_id;
    }
}

