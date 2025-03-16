package exercicio_8;

import java.util.Scanner;

//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

public class Resolucao2 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        int a, b, c;
        int menor = 0;
        int meio = 0;
        int maior = 0;

        System.out.print("Digite o primeiro valor: ");
        a = meuScanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = meuScanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        c = meuScanner.nextInt();

        if(a<b && a<c) {
            menor = a;
            if (b<c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if(b<a && b<c) {
            menor = b;
            if(a<c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else if(c<a && c<b) {
            menor = c;
            if(b<a) {
                meio = b;
                maior = a;
            } else {
                meio = a;
                maior = b;
            }
        } else {
            System.out.println("\nPor favor, não digite valores iguais.");
        }

        if(a!=b && b!=c && a!=c) {
            System.out.println("\nA ordem decrescente é: " + menor + "," + meio + "," + maior + ".");
        }
        //Essa alternativa de resolução diminui a quantidade de impressões no código, mas não sei se o código fica visivelmente melhor.
    }
}

