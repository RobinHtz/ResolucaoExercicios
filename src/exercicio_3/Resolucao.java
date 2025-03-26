package exercicio_3;

import java.util.Scanner;

/* 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.
*/

public class Resolucao {
    public static void main(String[] args) {
        lerValoresEComparar();
    }

    public static void lerValoresEComparar() {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int A = meuScanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int B = meuScanner.nextInt();

        if(A==B) {
            System.out.println("\nO resultado é "+(A+B));
        } else {
            System.out.println("\nO resultado é "+(A*B));
        }
    }
}