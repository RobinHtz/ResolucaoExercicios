package exercicio11.resolucao1;

import java.util.Scanner;

/*11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das notas obtidas, imprima na tela o nome do aluno e
se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.*/

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        String nomeAluno;
        double nota1, nota2, nota3, nota4, mediaNotas;

        System.out.print("Digite o nome do aluno: ");
        nomeAluno = meuScanner.nextLine();

        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = meuScanner.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = meuScanner.nextDouble();
        System.out.print("Digite a terceira nota do aluno: ");
        nota3 = meuScanner.nextDouble();
        System.out.print("Digite a quarta nota do aluno: ");
        nota4 = meuScanner.nextDouble();

        mediaNotas = (nota1+nota2+nota3+nota4)/4;

        System.out.println("\n------------------------------------------");
        System.out.println("Nome do aluno: "+nomeAluno);
        System.out.println("Média das notas do aluno: "+mediaNotas);

        if(mediaNotas>=7){
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
        System.out.println("------------------------------------------");
    }
}