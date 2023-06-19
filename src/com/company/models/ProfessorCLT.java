package com.company.models;

public class ProfessorCLT extends Professor {
    private double salario;

    public ProfessorCLT(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double calcularValorReceber() {
        return salario;
    }
}
