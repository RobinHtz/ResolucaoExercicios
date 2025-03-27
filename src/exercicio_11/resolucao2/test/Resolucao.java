package exercicio_11.resolucao2.test;

import exercicio_11.resolucao2.dominio.Aluno;

import static exercicio_11.resolucao2.servicos.ImpressaoAluno.imprimirResultados;
import static exercicio_11.resolucao2.servicos.LerDados.lerTodosDados;

/*11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
 se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7. */

public class Resolucao {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        lerTodosDados(aluno);
        imprimirResultados(aluno);
    }
}