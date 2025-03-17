package exercicio_16;

import java.util.Scanner;

//16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//equilátero, isósceles ou escaleno.

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        double A,B,C;

        System.out.print("Digite um lado do triângulo: ");
        A = meuScanner.nextDouble();
        System.out.print("Digite outro lado do triângulo: ");
        B = meuScanner.nextDouble();
        System.out.print("Digite o último lado do triângulo: ");
        C = meuScanner.nextDouble();

        if(A+B<C || A+C<B || B+C<A) {
            System.out.println("\nTriângulo inválido, o programa será reiniciado.");
            System.exit(0);
        }

        if(A!=B && A!=C && C!=B) {
            System.out.println("Triângulo escaleno.");
        } else if(A==B && B==C) {
            System.out.println("Triângulo equilátero.");
        } else {
            System.out.println("Triângulo isósceles.");
        }
    }
}
