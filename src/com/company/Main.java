package com.company;


import com.company.models.Professor;
import com.company.models.ProfessorCLT;
import com.company.models.ProfessorHorista;
import com.company.models.ProfessorPJ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do professor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o regime de pagamento (CLT, Horista ou PJ): ");
        String regimePagamento = scanner.nextLine();

        Professor professor;

        if (regimePagamento.equalsIgnoreCase("CLT")) {
            System.out.print("Digite o salário mensal do professor: ");
            double salario = scanner.nextDouble();
            professor = new ProfessorCLT(nome, salario);
        } else if (regimePagamento.equalsIgnoreCase("Horista")) {
            System.out.print("Digite o número de horas trabalhadas pelo professor: ");
            double horasTrabalhadas = scanner.nextDouble();
            System.out.print("Digite o valor da hora de trabalho: ");
            double valorHora = scanner.nextDouble();
            professor = new ProfessorHorista(nome, horasTrabalhadas, valorHora);
        } else if (regimePagamento.equalsIgnoreCase("PJ")) {
            System.out.print("Digite o valor do contrato do professor: ");
            double valorContrato = scanner.nextDouble();
            professor = new ProfessorPJ(nome, valorContrato);
        } else {
            System.out.println("Regime de pagamento inválido.");
            return;
        }

        double valorReceber = professor.calcularValorReceber();
        System.out.println("Nome do professor: " + professor.getNome());
        System.out.println("Valor a receber: " + valorReceber);
    }

}
