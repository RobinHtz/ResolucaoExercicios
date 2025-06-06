package exercicio_5;

import java.util.Scanner;

/* 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).  */

public class Resolucao {
    public static void main(String[] args) {
        lerSalariosECalcular();
    }

    public static void lerSalariosECalcular() {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite o valor de um salário mínimo: ");
        double salarioMinimo = meuScanner.nextDouble();

        System.out.print("Digite o valor de seu salário: ");
        double salarioUsuario = meuScanner.nextDouble();

        System.out.printf("\nO usuário recebe cerca de %.1f salários mínimos.\n",salarioUsuario/salarioMinimo);
    }
}
