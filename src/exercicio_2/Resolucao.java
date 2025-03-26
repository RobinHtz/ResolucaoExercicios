package exercicio_2;

import java.util.Scanner;

//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

public class Resolucao {
    public static void main(String[] args) {
        double num = lerValor();
        parOuImpar(num);
        positivoOuNegativo(num);
    }

    public static double lerValor() {
        Scanner meuScanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        return meuScanner.nextDouble();
    }

    public static void parOuImpar(double num) {
        if(num%2==0) {
            System.out.print("\nO número "+num+" é par e ");
        } else {
            System.out.print("\nO número "+num+" é impar e ");
        }
    }

    public static void positivoOuNegativo(double num) {
        if(num>0) {
            System.out.println("positivo.");
        } else if(num == 0){
            System.out.println("neutro.");
        } else {
            System.out.println("negativo.");
        }
    }
}