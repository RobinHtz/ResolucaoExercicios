package exercicio7;

import java.util.Scanner;

//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        boolean bool1,bool2;

        System.out.print("Digite true ou false para o primeiro valor booleano: ");
        bool1 = meuScanner.nextBoolean();
        System.out.print("Digite true ou false para o segundo valor booleano: ");
        bool2 = meuScanner.nextBoolean();

        if(bool1 == bool2) {
            if(bool1) {
                System.out.print("\nOs dois valores booleanos são verdadeiros.");
            } else {
                System.out.print("\nOs dois valores booleanos são falsos.");
            }
        } else {
            System.out.print("\nOs valores booleanos são diferentes.");
        }
    }
}
