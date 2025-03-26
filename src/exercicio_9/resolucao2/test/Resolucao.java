package exercicio_9.resolucao2.test;

import exercicio_9.resolucao2.dominio.Pessoa;

import static exercicio_9.resolucao2.servico.LeituraDados.*;
import static exercicio_9.resolucao2.servico.TabelaIMC.tabelaIMC;

/*9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
de acordo com a tabela abaixo:

Fórmula do IMC = peso / (altura) ²

Tabela Condições IMC

 Abaixo de 18,5   | Abaixo do peso
 Entre 18,6 e 24,9 | Peso ideal (parabéns)
 Entre 25,0 e 29,9 | Levemente acima do peso
 Entre 30,0 e 34,9 | Obesidade grau I
 Entre 35,0 e 39,9 | Obesidade grau II (severa)
 Maior ou igual a 40 | Obesidade grau III (mórbida) */


public class Resolucao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        lerDados(pessoa);
        tabelaIMC(pessoa);
    }
}
