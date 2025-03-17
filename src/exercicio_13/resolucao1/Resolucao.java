package exercicio_13.resolucao1;

import java.util.Scanner;

//13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = meuScanner.nextLine();
        System.out.print("Digite sua idade: ");
        idade = meuScanner.nextInt();
        if(idade<=0) {
            System.out.print("Idade inválida, digite novamente sua idade: ");
            idade = meuScanner.nextInt();
        }

        System.out.print(nome+" é ");
        if(idade>=18) {
            System.out.println("maior de idade.");
        } else {
            System.out.print("menor de idade.");
        }
    }
}