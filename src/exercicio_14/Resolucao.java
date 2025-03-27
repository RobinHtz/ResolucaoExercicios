package exercicio_14;

import java.util.Scanner;

//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

public class Resolucao {
    public static void main(String[] args) {
        double A = lerPrimeiroValor();
        double B = lerSegundoValor();

        trocarValores(A,B);
    }

    public static double lerPrimeiroValor() {
        Scanner meuScanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        return meuScanner.nextDouble();
    }

    public static double lerSegundoValor() {
        Scanner meuScanner = new Scanner(System.in);
        System.out.print("Digite o segundo valor: ");
        return meuScanner.nextDouble();
    }

    public static void trocarValores(double A, double B) {
        double reserva;
        System.out.println("\nValor antes da troca, valor A "+A+" e valor B "+B);
        reserva = B;
        B = A;
        A = reserva;
        System.out.println("\nValor depois da troca, valor A "+A+" e valor B "+B);
    }
}