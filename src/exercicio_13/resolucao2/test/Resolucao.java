package exercicio_13.resolucao2.test;

import exercicio_13.resolucao2.dominio.Pessoa;

import java.util.Scanner;

//13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite seu nome: ");
        pessoa.setNome(meuScanner.nextLine());
        System.out.print("Digite sua idade: ");
        pessoa.setIdade(meuScanner.nextInt());

        System.out.println();
        pessoa.impressao();
    }
}