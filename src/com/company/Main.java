package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Exercicio 1 Faça um Programa que mostre a mensagem "Alo mundo" na tela.
        exercicio1();

        //Exercicio 2 Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
        exercicio2();

        //Exercicio 3 Faça um Programa que peça dois números e imprima a soma.
        exercicio3(entrada);

        //Exercicio 4 Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        exercicio4(entrada);

        //Exercicio 5 Faça um Programa que converta metros para centímetros.
        exercicio5(entrada);

        //Exercicio 6 Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        exercicio6(entrada);
        
        //Exercicio 7 Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
        exercicio7(entrada);

    }

    private static void exercicio7(Scanner entrada) {
        System.out.println("Digite o valor da lateral do quadrado: ");
        float lado = entrada.nextFloat();
        System.out.println("O dobro da area do quadrado eh de: " + ((lado * lado) * 2) );
    }

    private static void exercicio6(Scanner entrada) {

        double raio;
        double area;
        final double PI = 3.1416;

        System.out.println("Escreva o valor do raio");
        raio = entrada.nextFloat();
        area  = PI* (raio*raio);

        System.out.print("O valor da area é " + area);
        System.out.print(area);
    }

    private static void exercicio5(Scanner entrada) {
        System.out.print("Qual o valor em Metros que deseja transformar? ");
        float metros = entrada.nextFloat();

        float centimetros = metros * 100;

        System.out.printf("%.1f cm",centimetros);
    }

    private static void exercicio4(Scanner entrada) {
        System.out.print("Digite o Nota do primeiro bimestre? ");
        int nota1 = entrada.nextInt();

        System.out.print("Digite o Nota do Segundo bimestre? ");
        int nota2 = entrada.nextInt();

        System.out.print("Digite o Nota do terceiro bimestre? ");
        int nota3 = entrada.nextInt();

        System.out.print("Digite o Nota do Quarto bimestre? ");
        int nota4 = entrada.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A soma entre os numeros são foi [" + media + "]");
    }

    private static void exercicio3(Scanner entrada) {
        System.out.print("Digite o Primeiro numero? ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o Segundo numero? ");
        int numero2 = entrada.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma entre os numeros são foi [" + soma + "]");

    }

    private static void exercicio2() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero? ");
        int numero = entrada.nextInt();

        System.out.println("O numero Digitado foi [" + numero + "]");
    }

    public static void exercicio1() {
        System.out.println("Hello, World");
    }
}
