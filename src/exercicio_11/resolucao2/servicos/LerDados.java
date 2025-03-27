package exercicio_11.resolucao2.servicos;

import exercicio_11.resolucao2.dominio.Aluno;

import java.util.Scanner;

public class LerDados {
    static Scanner meuScanner = new Scanner(System.in);

    public static void lerTodosDados(Aluno aluno) {
        lerNomeAluno(aluno);
        lerQuantidadeProvas(aluno);
        lerNotasProvas(aluno);
    }

    public static void lerNomeAluno(Aluno aluno) {
        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(meuScanner.nextLine());
    }

    public static void lerQuantidadeProvas(Aluno aluno) {
        System.out.print("Digite a quantidade de provas que o aluno realizou: ");
        int temp = meuScanner.nextInt();
        if(temp > 0) {
            aluno.setNotas(new double [temp]);
        } else {
            System.out.println("\nPor favor, digite um número inteiro maior que 0.");
            lerQuantidadeProvas(aluno);
        }

    }

    public static void lerNotasProvas(Aluno aluno) {
        double[] notas = new double[aluno.getNotas().length];
        for(int num = 0; num < aluno.getNotas().length; num++) {
            System.out.println("Digite a "+ ++num +"º nota do aluno: ");
            notas[--num]=meuScanner.nextDouble();
        }
        aluno.setNotas(notas);
    }
}