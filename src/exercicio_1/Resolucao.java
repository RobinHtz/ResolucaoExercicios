package exercicio_1;

import java.util.Scanner;

// 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class Resolucao {
    public static void main(String[] args) {
        double [] numeros = new double[3];
        double soma;

        lerValores(numeros);
        soma = somarDoisNumeros(numeros[0],numeros[1]);
        compararSomaComC(soma, numeros[2]);
    }

    public static void lerValores(double [] num) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        num[0] = meuScanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        num[1] = meuScanner.nextDouble();
        System.out.print("Digite o último valor: ");
        num[2] = meuScanner.nextDouble();
    }

    public static double somarDoisNumeros(double a, double b) {
        double soma = a+b;
        System.out.printf("\nA soma entre os valores %.0f e %.0f resulta em %.0f.\n\n",a,b,soma);
        return soma;
    }

    public static void compararSomaComC(double soma, double c) {
        if(soma > c) {
            System.out.println("A soma não é menor que C.");
        } else if(soma < c) {
            System.out.println("A soma é menor que C.");
        } else {
            System.out.println("A soma é igual a C.");
        }
    }
}