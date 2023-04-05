package com.company.ListaEstruturaSequencial;

import java.util.Scanner;

public class EstruturaSequencial {

    public static void executarLista() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Lista de exercicio EstruturaSequencial ? \n");

        System.out.print("Qual exercicio deseja executar? \n");
        System.out.print("Exercicio 1\n");
        System.out.print("Exercicio 2\n");
        System.out.print("Exercicio 3\n");
        System.out.print("Exercicio 4\n");
        System.out.print("Exercicio 5\n");
        System.out.print("Exercicio 6\n");
        System.out.print("Exercicio 7\n");
        System.out.print("Exercicio 8\n");
        System.out.print("Exercicio 9\n");
        System.out.print("Exercicio 10\n");
        System.out.print("Exercicio 11\n");
        System.out.print("Exercicio 12\n");
        System.out.print("Exercicio 13\n");
        System.out.print("Exercicio 14\n");
        System.out.print("Exercicio 15\n");
        System.out.print("Exercicio 16\n");
        System.out.print("Exercicio 17\n");
        int numeroExercicioDigitado = entrada.nextInt();

        switch (numeroExercicioDigitado) {
            case 1:
                exercicio1();
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
            case 5:
                exercicio5(entrada);
                break;
            case 6:
                exercicio6(entrada);
                break;
            case 7:
                exercicio7(entrada);
                break;

            case 8:
                exercicio8(entrada);
                break;

            case 9:
                exercicio9(entrada);
                break;

            case 10:
                break;

            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;

            case 16:
                break;

            case 17:
                // Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a
                // ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
                //Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
                //comprar apenas latas de 18 litros;
                //comprar apenas galões de 3,6 litros;
                //misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
                exercicio17(entrada);
                break;

            default:
                System.out.print("Exercicio não existente  ");
        }
    }

    private static void exercicio17(Scanner entrada) {
        System.out.print("Digite a area em M2 que será pintada?  ");
        int area = entrada.nextInt();
        double litros = area / 3;
        double quantidadeLatas = Math.ceil(litros / 18);
        double valorFinal = quantidadeLatas * 80;
        System.out.println("Quantidade de Latas: " + quantidadeLatas);
        System.out.println("R$ " + valorFinal);

    }

    private static void exercicio9(Scanner entrada) {
        System.out.println("Exercicio 9: \n");
        System.out.println("Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. \n");

        double celsius, fahrenheit;

        System.out.print("Conversor de temperatura: Graus Celsios -> Fahrenheit\n\n");

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = entrada.nextDouble();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.print("\n A medida convertida é " + fahrenheit + "ºF\n");
    }

    private static void exercicio8(Scanner entrada) {
        System.out.println("Exercicio 8: \n");
        System.out.println("Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês. \n");

        System.out.println("Digite o valor da sua hora de trabalho: ");
        float valordahora = entrada.nextFloat();
        System.out.println("Digite quantas horas voce trabalha por dia: ");
        int horastrabalhadas = entrada.nextInt();
        int quantidadededias = 22; //estimativa de dias úteis em um mês
        System.out.printf("O seu salario, em um mes, eh de: %.2f", (valordahora * horastrabalhadas) * quantidadededias);

    }

    private static void exercicio7(Scanner entrada) {
        System.out.println("Exercicio 17: \n");
        System.out.println("Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário. \n");


        System.out.println("Digite o valor da lateral do quadrado: ");
        float lado = entrada.nextFloat();
        System.out.println("O dobro da area do quadrado eh de: " + ((lado * lado) * 2));
    }

    private static void exercicio6(Scanner entrada) {
        System.out.println("Exercicio 6: \n");
        System.out.println("Faça um Programa que peça o raio de um círculo, calcule e mostre sua área. \n");
        double raio;
        double area;
        final double PI = 3.1416;

        System.out.println("Escreva o valor do raio");
        raio = entrada.nextFloat();
        area = PI * (raio * raio);

        System.out.print("O valor da area é " + area);
        System.out.print(area);
    }

    private static void exercicio5(Scanner entrada) {
        System.out.println("Exercicio 5: \n");
        System.out.println("Faça um Programa que converta metros para centímetros. \n");

        System.out.print("Qual o valor em Metros que deseja transformar? ");
        float metros = entrada.nextFloat();

        float centimetros = metros * 100;

        System.out.printf("%.1f cm", centimetros);
    }

    private static void exercicio4(Scanner entrada) {
        System.out.println("Exercicio 4: \n");
        System.out.println("Faça um Programa que peça as 4 notas bimestrais e mostre a média. \n");

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
        System.out.println("Exercicio 3: \n");
        System.out.println(" Faça um Programa que peça dois números e imprima a soma. \n");

        System.out.print("Digite o Primeiro numero? ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o Segundo numero? ");
        int numero2 = entrada.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma entre os numeros são foi [" + soma + "]");
    }

    private static void exercicio2(Scanner entrada) {
        System.out.println("Exercicio 2: \n");
        System.out.println(" Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. \n");

        System.out.print("Digite o numero?\n ");
        int numero = entrada.nextInt();

        System.out.println("O numero Digitado foi [" + numero + "]");
    }

    public static void exercicio1() {
        System.out.println("Exercicio 1: \n");
        System.out.println("Faça um Programa que mostre a mensagem Alo mundo na tela. \n");
        System.out.println("Hello, World");
    }

}
