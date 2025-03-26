package exercicio_6;

import java.util.Scanner;

//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

public class Resolucao {
    public static void main(String[] args) {
        lerValorEReajustar();
    }

    public static void lerValorEReajustar() {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite um valor qualquer: ");
        double valor = meuScanner.nextDouble();

        valor += (valor*5)/100;
        System.out.println("Valor com reajuste: "+valor);
    }
}
