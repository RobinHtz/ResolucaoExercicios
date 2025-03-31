package exercicio_17;

import java.util.Scanner;

/*
Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.

Fórmula: C = (5 * ( F-32) / 9)
 */

public class Resolucao {
    public static void main(String[] args) {
        double temperatura = leitorTemperatura();
        temperaturaCorrespondente(temperatura);
    }

    public static double leitorTemperatura() {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        return meuScanner.nextDouble();
    }

    public static void temperaturaCorrespondente(double temperatura) {
        System.out.println("\nA temperatura "+temperatura+" °F corresponde em graus Celsius: ");
        temperatura = (5*(temperatura - 32)/9);
        System.out.printf("%.1f °C",temperatura);
    }
}
