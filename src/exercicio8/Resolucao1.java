package exercicio8;

import java.util.Scanner;

//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

public class Resolucao1 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite o primeiro valor: ");
        a = meuScanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = meuScanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        c = meuScanner.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.print("Ordem decrescente: " + a + "," + b + "," + c + ".");
            } else {
                System.out.print("Ordem decrescente: " + a + "," + c + "," + b + ".");
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.print("Ordem decrescente: " + b + "," + a + "," + c + ".");
            } else {
                System.out.print("Ordem decrescente: " + b + "," + c + "," + a + ".");
            }
        } else if (c < a && c < b) {
            if (b < a) {
                System.out.print("Ordem decrescente: " + c + "," + b + "," + a + ".");
            } else {
                System.out.print("Ordem decrescente: " + c + "," + a + "," + b + ".");
            }
        } else {
            System.out.println("\nPor favor, não digite valores iguais.");
        }
    }
}
