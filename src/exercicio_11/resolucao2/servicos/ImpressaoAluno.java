package exercicio_11.resolucao2.servicos;

import exercicio_11.resolucao2.dominio.Aluno;

public class ImpressaoAluno {
    public static void imprimirResultados(Aluno aluno) {
        System.out.println("\n=======================================");
        System.out.println("Nome do aluno: "+aluno.getNome());
        System.out.println("Media aluno: "+aluno.calcularMedia());
        aluno.aprovadoOuReprovado();
        System.out.println("---------------------------------------");
        if(aluno.getIsAprovado()) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
        System.out.println("=======================================");
    }
}