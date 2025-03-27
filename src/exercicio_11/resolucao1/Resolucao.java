package exercicio_11.resolucao1;

import java.util.Scanner;

/*11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das notas obtidas, imprima na tela o nome do aluno e
se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.*/

public class Resolucao {
    public static void main(String[] args) {
        String nomeAluno;
        double mediaNotas;

        nomeAluno = lerNomeAluno();
        mediaNotas = lerNotasAlunoECalculaMedia();
        imprimeAluno(nomeAluno, mediaNotas);
    }

    public static String lerNomeAluno() {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        return meuScanner.nextLine();
    }

    public static double lerNotasAlunoECalculaMedia() {
        Scanner meuScanner = new Scanner(System.in);
        double [] notas = new double[4];

        System.out.print("Digite a primeira nota do aluno: ");
        notas[0] = meuScanner.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        notas[1] = meuScanner.nextDouble();
        System.out.print("Digite a terceira nota do aluno: ");
        notas[2] = meuScanner.nextDouble();
        System.out.print("Digite a quarta nota do aluno: ");
        notas[3] = meuScanner.nextDouble();

        return ((notas[0]+notas[1]+notas[2]+notas[3])/4);
    }

    public static void imprimeAluno(String nomeAluno, double mediaNotas) {

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