package exercicio3;

import java.util.Scanner;

/* 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.
*/

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        int A,B,C;

        System.out.print("Digite o primeiro número: ");
        A = meuScanner.nextInt();
        System.out.print("Digite o segundo número: ");
        B = meuScanner.nextInt();

        if(A==B) {
            C=A+B;
        } else {
            C=A*B;
        }

        System.out.println("\nO resultado é "+C);
    }
}
