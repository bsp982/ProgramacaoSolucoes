package com.company.models;

public class ProfessorPJ extends Professor {
    private double valorContrato;

    public ProfessorPJ(String nome, double valorContrato) {
        super(nome);
        this.valorContrato = valorContrato;
    }

    public double calcularValorReceber() {
        return valorContrato;
    }
}
