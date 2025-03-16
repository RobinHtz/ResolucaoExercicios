package exercicio4;

import java.util.Scanner;

//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = meuScanner.nextInt();
        num = num-1;

        System.out.print("Antecessor do número: "+ num++);
        System.out.print("\nSucessor do número: "+ ++num);
    }
}
