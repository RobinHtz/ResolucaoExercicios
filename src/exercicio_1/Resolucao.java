package exercicio_1;

import java.util.Scanner;

// 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        double a,b,c,soma;

        System.out.println("-> Comparador de uma Soma com um Número <-");
        System.out.println("Os dois primeiro números digitados serão somados e comparados com o terceiro número.\n");

        System.out.print("Digite o primeiro valor: ");
        a = meuScanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        b = meuScanner.nextDouble();
        System.out.print("Digite o último valor: ");
        c = meuScanner.nextDouble();

        soma = a+b;
        System.out.printf("\nA soma entre os valores %.0f e %.0f resulta em %.0f.\n\n",a,b,soma);

        if(soma >= c) {
            System.out.print("A soma não é menor que C.");
        } else {
            System.out.print("A soma é menor que C!");
        }
    }
}
