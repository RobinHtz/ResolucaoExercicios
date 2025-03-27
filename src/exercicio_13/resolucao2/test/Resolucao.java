package exercicio_13.resolucao2.test;

import exercicio_13.resolucao2.dominio.Pessoa;

import static exercicio_13.resolucao2.servico.Impressao.imprimir;
import static exercicio_13.resolucao2.servico.LerValores.lerValores;

//13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

public class Resolucao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        lerValores(pessoa);
        imprimir(pessoa);
    }
}