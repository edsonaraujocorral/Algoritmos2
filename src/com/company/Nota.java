package com.company;

public class Nota {
    private String aluno;
    private double valor;

    public Nota(String setAluno, double setValor) {
        this.aluno = setAluno;
        this.valor = setValor;
    }

    public String getAluno() {
        return this.aluno;
    }

    public double getValor() {
        return this.valor;
    }
}
