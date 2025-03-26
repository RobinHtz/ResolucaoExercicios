package exercicio_4;

import java.util.Scanner;

//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

public class Resolucao {
    public static void main(String[] args) {
        int num = lerValor();
        antecessorESucessor(--num);
    }

    public static int lerValor() {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        return meuScanner.nextInt();
    }

    public static void antecessorESucessor(int num) {
        System.out.print("\nAntecessor do número: "+ num++);
        System.out.println("\nSucessor do número: "+ ++num);
    }
}