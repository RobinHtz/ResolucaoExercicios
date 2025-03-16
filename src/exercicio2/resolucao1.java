package exercicio2;

import java.util.Scanner;

//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

public class resolucao1 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        double num;

        System.out.print("Digite um número: ");
        num = meuScanner.nextDouble();

        if(num%2==0) {
            System.out.print("\nO número "+num+" é par e ");
        } else {
            System.out.print("\nO número "+num+" é impar e ");
        }

        if(num>=0) {
            System.out.print("positivo.");
        } else {
            System.out.print("negativo.");
        }
    }
}
