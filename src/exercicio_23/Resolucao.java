package exercicio_23;

import java.util.Scanner;

/*
Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS.
Imprima na tela o salário líquido final.
 */

public class Resolucao {
    public static void main(String[] args) {
        leitorDados();
    }

    public static void leitorDados() {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Qual o valor da aula?");
        double valorAula = meuScanner.nextDouble();

        System.out.println("Quantas aulas leciona por mês?");
        int numeroAulas = meuScanner.nextInt();

        System.out.println("Qual o percentual do INSS?");
        double percentualINSS = meuScanner.nextDouble();

        calcularSalarios(valorAula, numeroAulas, percentualINSS);
    }

    public static void calcularSalarios(double valorAula, int numeroAulas, double percentualINSS) {
        double salarioBruto = valorAula*numeroAulas;

        double salarioLiquido = salarioBruto - (salarioBruto*percentualINSS/100);
        System.out.printf("\nSálario líquido de R$ %.2f",salarioLiquido);
    }
}
