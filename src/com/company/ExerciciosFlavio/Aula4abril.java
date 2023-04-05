package com.company.ExerciciosFlavio;

import java.util.Scanner;

public class Aula4abril {
    public static void executarLista() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual exercicio deseja executar? \n");

        System.out.print("Exercicio 1\n");
        System.out.print("Exercicio 2\n");
        System.out.print("Exercicio 3\n");
        System.out.print("Exercicio 4\n");

        int numeroExercicioDigitado = entrada.nextInt();

        switch (numeroExercicioDigitado) {
            case 1:
                exercicio1(entrada);
                break;
            case 2:
                exercicio2(entrada);
                break;
            case 3:
                exercicio3(entrada);
                break;
            case 4:
                exercicio4(entrada);
                break;
        }
    }

    private static void exercicio4(Scanner entrada) {

        System.out.println("Exercicio 4:\n ");
        System.out.println(" Faça um programa que leia o nome, o sobrenome, a idade, em\n" +
                "        anos, e a naturalidade (cidade de nascimento) de uma pessoa.\n" +
                "        Depois, o programa deve dar a seguinte opção “Deseja\n" +
                "        visualizar dados completos?”. Se o caractere digitado pelo\n" +
                "        usuário for ‘S’ o programa deve imprimir na tela Nome,\n" +
                "        Sobrenome, idade e naturalidade. Se o caractere digitado pelo\n" +
                "        usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se\n" +
                "        o caractere não for nenhuma das outras opções acima o programa\n" +
                "        deve imprimir “Digitação errada. Tente Novamente”.:\n ");


        System.out.println("Digite o nome: ");
        String nome = entrada.next();
        System.out.println("Digite o sobrenome: ");
        String sobrenome = entrada.next();
        System.out.println("Digite o nacionalidade: ");
        String nacionalidade = entrada.next();
        System.out.println("Digite a idade: ");
        int idade = entrada.nextInt();


        System.out.println("Deseja visualizar dados completos");
        String resposta = entrada.next();

        if (!(resposta.equals("s") || resposta.equals("n"))) {
            System.out.println("Digitação errada. Tente Novamente");
        } else if (resposta.equals("s")) {
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobrenome);
            System.out.println("Nacionalidade: " + nacionalidade);
            System.out.println("Idade: " + idade);
        }

    }

    private static void exercicio3(Scanner entrada) {
        System.out.println("Exercicio 3: \n");

        System.out.println("Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar e se é positivo ou negativo..");

        System.out.println("Digite o numero: \n");
        int numeroDIgitado = entrada.nextInt();

        if (numeroDIgitado / 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("impar");
        }

        if (numeroDIgitado > 0) {
            System.out.println("positivo");
        } else if (numeroDIgitado == 0) {
            System.out.println("neutro");
        } else {
            System.out.println("negativo");
        }

    }

    private static void exercicio2(Scanner entrada) {
        System.out.println("Exercicio 2: \n");
        System.out.println("Faça um Programa que peça tres numeros e imprima por ordem crescente.");

        System.out.println("Digite o primeiro numero: \n");
        int A = entrada.nextInt();

        System.out.println("Digite o segundo numero: \n");
        int B = entrada.nextInt();

        System.out.println("Digite o terceiro numero: \n");
        int C = entrada.nextInt();

        if (A > B && A > C && B > C) {
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        } else if (A > B && A > C && C > B) {
            System.out.println(A);
            System.out.println(C);
            System.out.println(B);
        } else if (B > A && B > C && A > C) {
            System.out.println(B);
            System.out.println(A);
            System.out.println(C);
        } else if (B > A && B > C && C > A) {
            System.out.println(B);
            System.out.println(C);
            System.out.println(A);
        } else if (C > A && C > B && A > B) {
            System.out.println(C);
            System.out.println(A);
            System.out.println(B);
        } else if (C > A && C > B && B > A) {
            System.out.println(C);
            System.out.println(B);
            System.out.println(A);
        }
    }

    private static void exercicio1(Scanner entrada) {
        System.out.println("Exercicio 1: \n");
        System.out.println("Faça um Programa que peça dois números e imprima o maior deles. \n");

        System.out.println("Digite o primeiro numero: \n");
        int numeroA = entrada.nextInt();

        System.out.println("Digite o segundo numero: \n");
        int numeroB = entrada.nextInt();
        entrada.close();

        if (numeroA > numeroB) {
            System.out.println(numeroA);
        } else {
            System.out.println(numeroB);
        }
    }

}
