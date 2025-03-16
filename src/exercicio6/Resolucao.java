package exercicio6;

import java.util.Scanner;

//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        double valor;

        System.out.print("Digite um valor qualquer: ");
        valor = meuScanner.nextDouble();

        valor += (valor*5)/100;
        System.out.println("Valor com novo reajuste "+valor);
    }
}
