package exercicio_14;

import java.util.Scanner;

//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        int A,B,C;

        System.out.print("Digite o primeiro valor: ");
        A = meuScanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        B = meuScanner.nextInt();

        System.out.println("Valor A e B antes da troca: "+A+" e "+B);
        C = B;
        B = A;
        A = C;
        System.out.println("Valor A e B depois da troca: "+A+" e "+B);
    }
}