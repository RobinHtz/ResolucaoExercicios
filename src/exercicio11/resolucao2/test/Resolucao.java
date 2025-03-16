package exercicio11.resolucao2.test;

import java.util.Scanner;
import exercicio11.resolucao2.dominio.Aluno;

/*11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
 se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7. */

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        double[] notas;

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(meuScanner.nextLine());

        System.out.print("Digite a quantidade de provas que o aluno realizou: ");
        notas = new double [meuScanner.nextInt()];

        for(int num = 0; num < notas.length; num++) {
            System.out.print("Digite a "+ ++num +"º nota do aluno: ");
            notas[--num]=meuScanner.nextDouble();
        }
        aluno.setNotas(notas);

        System.out.println("\n---------------------------------------");
        System.out.println("Nome do aluno: "+aluno.getNome());
        System.out.println("Media aluno: "+aluno.calcularMedia());
        aluno.aprovadoOuReprovado();
        System.out.println("---------------------------------------");
    }
}