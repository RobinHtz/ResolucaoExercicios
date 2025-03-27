package exercicio_13.resolucao1;

import java.util.Scanner;

//13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

public class Resolucao {
    public static void main(String[] args) {
        lerValores();
    }

    public static void lerValores() {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = meuScanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = meuScanner.nextInt();
        if(idade<0) {
            System.out.print("Idade inválida, digite uma idade válida: ");
            idade = meuScanner.nextInt();
        }

        verificarIdade(nome,idade);
    }

    public static void verificarIdade(String nome, int idade) {
        System.out.print("\n"+nome+" é ");
        if(idade>=18) {
            System.out.println("maior de idade.");
        } else {
            System.out.print("menor de idade.");
        }
    }
}