package exercicio_10;

import java.util.Scanner;

//10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        double nota1,nota2,nota3,media;

        System.out.print("Digite a primeira nota: ");
        nota1 = meuScanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = meuScanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = meuScanner.nextDouble();

        media = (nota1+nota2+nota3)/3;
        System.out.printf("\nA média das três notas é %.1f\n",media);
    }
}
