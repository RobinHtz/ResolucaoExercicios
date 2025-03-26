package exercicio_7;

import java.util.Scanner;

//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

public class Resolucao {
    public static void main(String[] args) {
        lerValoresEComparar();
    }

    public static void lerValoresEComparar() {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite true ou false para o primeiro valor booleano: ");
        boolean bool1 = meuScanner.nextBoolean();
        System.out.print("Digite true ou false para o segundo valor booleano: ");
        boolean bool2 = meuScanner.nextBoolean();

        if(bool1 == bool2) {
            if(bool1) {
                System.out.println("\nOs dois valores booleanos são verdadeiros.");
            } else {
                System.out.println("\nOs dois valores booleanos são falsos.");
            }
        } else {
            System.out.println("\nOs valores booleanos são diferentes.");
        }
    }
}