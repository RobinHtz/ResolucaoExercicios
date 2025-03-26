package exercicio_8;

import java.util.Arrays;
import java.util.Scanner;

//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

public class Resolucao1 {
    public static void main(String[] args) {
        int [] valores = new int[3];
        lerValores(valores);
        ordenarValores(valores);
    }

    public static void lerValores(int [] valores) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        valores[0] = meuScanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        valores[1] = meuScanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valores[2] = meuScanner.nextInt();

        if(valores[0] == valores[1] || valores[1] == valores[2] || valores[0] == valores[2]) {
            System.out.println("Não repita valores, faça novamente.");
            System.exit(0);
        }
    }

    public static void ordenarValores(int [] valores) {
        Arrays.sort(valores);
        int maior = valores[2];
        int meio = valores[1];
        int menor = valores[0];

        System.out.println("Ordem decrescente: "+maior+" "+meio+" "+menor);
    }
}