package com.company.ListaEstruturaSequencial;

import java.text.DecimalFormat;
import java.text.MessageFormat;
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
                exercicio10(entrada);
                break;
            case 11:
                exercicio11(entrada);
                break;
            case 12:
                exercicio12(entrada);
                break;
            case 13:
                exercicio13(entrada);
                break;
            case 14:
                exercicio14(entrada);
                break;
            case 15:
                exercicio15(entrada);
                break;

            case 16:
                exercicio16(entrada);
                break;

            case 17:
                exercicio17(entrada);
                break;
            case 18:
                exercicio18(entrada);
                break;

            default:
                System.out.print("Exercicio não existente  ");
        }
    }

    private static void exercicio12(Scanner entrada) {
        DecimalFormat dt = new DecimalFormat("#.##");

        System.out.print("Digite sua altura: ");
        double h = entrada.nextDouble();

        double calc = (72.7*h) - 58;

        String res = MessageFormat.format("Seu peso ideal é {0}Kg",dt.format(calc));

        System.out.println(res);
    }

    private static void exercicio11(Scanner entrada) {

        System.out.print("Digite um numero: ");
        int a = entrada.nextInt();

        System.out.print("Digite outro numero: ");
        int b = entrada.nextInt();

        System.out.print("Digite mais um numero: ");
        double c = entrada.nextDouble();


        String res1 = MessageFormat.format("o produto do dobro do primeiro com metade do segundo é {0}",(2*a)+(b/2));

        String res2 = MessageFormat.format("a soma do triplo do primeiro com o terceiro é {0}",3*a+c);

        String res3 = MessageFormat.format("o terceiro elevado ao cubo é {0}",(c*c*c));

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }

    private static void exercicio10(Scanner entrada) {
        System.out.print("Digite uma valor em graus celsius: ");
        double c = entrada.nextDouble();
        double calc = 1.8 * c + 32;

        String res = MessageFormat.format("O valor convertido em Fahrenheit é {0}°", calc);

        System.out.println(res);
    }

    private static void exercicio13(Scanner entrada) {
        DecimalFormat dt = new DecimalFormat("#.##");
        double calc;

        System.out.print("Digite sua altura: ");
        double h = entrada.nextDouble();

        System.out.print("Digite seu sexo (M/F): ");
        String sexo = entrada.next();

        calc = sexo.equals("F") ? (62.1 * h) - 44.7 : (72.7 * h) - 58;

        String res = MessageFormat.format("Seu peso ideal é {0}Kg", dt.format(calc));

        System.out.println(res);
    }

    private static void exercicio14(Scanner entrada) {
        int peso = entrada.nextInt();
        int calc_multa;
        String res = "Vocé não excedeu o peso limite";

        if (peso > 50) {
            calc_multa = peso - 50;

            res = MessageFormat.format("Sua multa por exceder o limite é {0}R$", calc_multa * 4.00);
        }

        System.out.println(res);
    }

    private static void exercicio15(Scanner entrada) {
        DecimalFormat dt = new DecimalFormat("#.##");

        System.out.print("digite o quanto ganha por hora: ");
        double numero = entrada.nextDouble();

        System.out.print("digite o numero de horas trabalhadas: ");
        double horas = entrada.nextDouble();

        double salario_bruto = (numero * horas);

        String res1 = MessageFormat.format("+ Salário Bruto : R${0}", dt.format(salario_bruto));
        String res2 = MessageFormat.format("- IR (11%) : R${0}", dt.format(salario_bruto * 11 / 100));
        String res3 = MessageFormat.format("- INSS (8%) : R${0}", dt.format(salario_bruto * 8 / 100));
        String res4 = MessageFormat.format("- Sindicato ( 5%) : R${0}", dt.format(salario_bruto * 5 / 100));
        String res5 = MessageFormat.format("= Salário Liquido : R${0}", dt.format(salario_bruto - salario_bruto * 24 / 100));

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
    }

    private static void exercicio16(Scanner entrada) {
        double calc;
        int quantidade_tinta;
        System.out.println("Digite um valor em m²: ");
        double area = entrada.nextDouble();

        calc = (area / 3) / 18;

        quantidade_tinta = (int) calc;

        if ((area / 3) % 18 != 0) {
            quantidade_tinta = (int) ((area / 3) / 18 + 1);
        }


        String tot_tinta = MessageFormat.format("Total de tintas compradas: {0}", quantidade_tinta);
        String tot_dinheiro = MessageFormat.format("Valor total é {0}R$", new DecimalFormat("#.##").format(quantidade_tinta * 80.00));

        System.out.println(tot_tinta);
        System.out.println(tot_dinheiro);
    }

    private static void exercicio18(Scanner entrada) {
        System.out.print("Digite o tamanho de um arquivo: ");

        System.out.print("Digite a velocidade do link: ");
        double arq_size = entrada.nextDouble();

        double link_internet = entrada.nextDouble();

        double calc = arq_size * 8 / link_internet;

        double minutos = calc / 60;

        String res = MessageFormat.format("Vai demorar {0} min ", (int) minutos);

        System.out.println(res);

    }

    private static void exercicio17(Scanner entrada) {
        // Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a
        // ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
        //Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
        //comprar apenas latas de 18 litros;
        //comprar apenas galões de 3,6 litros;
        //misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.


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
