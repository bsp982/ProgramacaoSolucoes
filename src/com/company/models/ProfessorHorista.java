package com.company.models;

public class ProfessorHorista extends Professor {
    private double horasTrabalhadas;
    private double valorHora;

    public ProfessorHorista(String nome, double horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double calcularValorReceber() {
        return horasTrabalhadas * valorHora;
    }
}
