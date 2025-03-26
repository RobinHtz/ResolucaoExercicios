package exercicio_10;

import java.util.Scanner;

//10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

public class Resolucao {
    public static void main(String[] args) {
        double [] notas = new double[3];

        lerNotas(notas);
        calcularMediaNotas(notas);
    }

    public static void lerNotas(double[] notas) {
        Scanner meuScanner = new Scanner(System.in);
        double [] num = new double[3];

        for(int aux = 0; aux<notas.length; aux++) {
            System.out.print("Digite a "+ ++aux +"º nota: ");
            num[--aux] = meuScanner.nextDouble();
            if(num[aux]<0) {
                System.out.print("Digite um valor maior ou igual a 0: ");
                notas[aux] = meuScanner.nextDouble();
            } else {
                notas[aux] = num[aux];
            }
        }
    }

    public static void calcularMediaNotas(double[] notas) {
        double media = (notas[0]+notas[1]+notas[2])/3;
        System.out.printf("\nA média das notas desse aluno é de: %.2f",media);
    }
}