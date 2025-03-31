package exercicio_20;

import java.util.Scanner;

//Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

public class Resultado {
    public static void main(String[] args) {
        int tabuada = lerValor();
        imprimirTabuada(tabuada);
    }

    public static int lerValor() {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para imprimir sua tabuada: ");
        return meuScanner.nextInt();
    }

    public static void imprimirTabuada(int tabuada) {
        System.out.println("\nTabuada do número "+tabuada);

        for(int num = 1; num <=10; num ++) {
            System.out.println(tabuada + " x " + num + " = " + (tabuada*num));
        }
    }

}
