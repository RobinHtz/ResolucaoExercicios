package exercicio_22;

import java.util.Scanner;

//Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

public class Resolucao {
    public static void main(String[] args) {
        lerECalcular();
    }

    public static void lerECalcular() {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int A = meuScanner.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        int B = meuScanner.nextInt();

        calcular(A,B);
    }

    public static void calcular(int A, int B) {
        System.out.println("\nQuociente: "+(A/B));
        System.out.println("Resto: "+(A%B));
    }
}
