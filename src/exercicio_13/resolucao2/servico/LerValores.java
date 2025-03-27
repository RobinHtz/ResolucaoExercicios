package exercicio_13.resolucao2.servico;

import exercicio_13.resolucao2.dominio.Pessoa;

import java.util.Scanner;

public class LerValores {
    public static void lerValores(Pessoa pessoa) {
        Scanner meuScanner = new Scanner(System.in);

        lerNome(pessoa, meuScanner);
        lerIdade(pessoa, meuScanner);
        System.out.println();
    }

    public static void lerNome(Pessoa pessoa, Scanner meuScanner) {
        System.out.print("Digite seu nome: ");
        pessoa.setNome(meuScanner.nextLine());
    }

    public static void lerIdade(Pessoa pessoa, Scanner meuScanner) {
        System.out.print("Digite sua idade: ");
        int idade = meuScanner.nextInt();
        if(idade < 0) {
            System.out.println("Idade inválida.");
            lerIdade(pessoa, meuScanner);
        } else {
            pessoa.setIdade(idade);
        }
    }
}