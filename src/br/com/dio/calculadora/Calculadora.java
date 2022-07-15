package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro numero: ");
        a = in.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = in.nextInt();

        int soma = soma(a, b);
        int subtracao = subtracao(a, b);
        int multiplicacao = multiplicacao(a, b);
        int divisao = divisao(a, b);

        System.out.println("Soma = " + soma);
        System.out.println("Subtracao = " + subtracao);
        System.out.println("Multiplicacao = " + multiplicacao);
        System.out.println("Divisao = " + divisao);
    }

    public static int soma(int a, int b){
        return a + b;
    }

    public static int subtracao(int a, int b){
        return a - b;
    }

    public static int multiplicacao(int a, int b){
        return a * b;
    }

    public static int divisao(int a, int b){
        return a / b;
    }
}
