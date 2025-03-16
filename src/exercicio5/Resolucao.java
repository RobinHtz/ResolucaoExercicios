package exercicio5;

import java.util.Scanner;

/* 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).  */

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        double salarioMinimo,salarioUsuario,quantidadeSalariosMin;

        System.out.print("Digite o valor de um salário mínimo: ");
        salarioMinimo = meuScanner.nextDouble();
        System.out.print("Digite o valor de seu salário: ");
        salarioUsuario = meuScanner.nextDouble();

        quantidadeSalariosMin = salarioUsuario/salarioMinimo;
        System.out.printf("\nA quantidade de salários mínimos que o usuário recebe é %.1f.",quantidadeSalariosMin);
    }
}
