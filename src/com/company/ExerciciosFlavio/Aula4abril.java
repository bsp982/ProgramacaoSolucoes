package com.company.ExerciciosFlavio;

import java.util.*;

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
            case 5:
                exercicio5(entrada);
                break;
            case 6:
                exercicio6(entrada);
                break;
            case 7:
                exercicio7(entrada);
                break;
            case 9:
                exercicio9(entrada);
                break;

            default:
                System.out.print("Exercicio não existente");
        }
    }

    private static void exercicio9(Scanner entrada) {

        //        9. Faça um programa que receba o valor da venda, escolha a
//        condição de pagamento no menu e mostre o total da venda final
//        conforme condições a seguir:
//        Venda a Vista - desconto de 10%
//                Venda a Prazo 30 dias - desconto de 5%
//                Venda a Prazo 60 dias - mesmo preço
//        Venda a Prazo 90 dias - acréscimo de 5%
//                Venda com cartão de débito - desconto de 8%
//                Venda com cartão de crédito - desconto de 7%
    }

    private static void exercicio7(Scanner entrada) {
        //        7. Crie um programa que lê um número entre 1 e 12, correspondendo
//        a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
//        Ao final, o programa deve imprimir uma mensagem identificando,
//                com base no número digitado, o nome do mês e a estação.
//        Exemplo para o mês 1: "Mês: Janeiro – Estação: Verão"
    }

    private static void exercicio6(Scanner entrada) {
        //        6. Faça um programa calcula o total de uma hospedagem em um
//        hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
//        R$ 5.50 por diária, se o número de diárias for maior que 15;
//        R$ 6.00 por diária, se o número de diárias for igual a 15;
//        R$ 8.00 por diária, se o número de diárias for menor que 15.
    }

    private static void exercicio5(Scanner entrada) {
        //        5. Faça um programa para imprimir o conceito de um aluno. O
//        conceito é calculado em função da nota do aluno que varia de 0
//        a 100. As faixas da correlação são mostradas abaixo:
//        Nota Conceito
//        0 a 49 Insuficiente
//        50 a 64 Regular
//        65 a 84 Bom
//        85 100 Ótimo
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
