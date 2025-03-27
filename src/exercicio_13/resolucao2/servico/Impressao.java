package exercicio_13.resolucao2.servico;

import exercicio_13.resolucao2.dominio.Pessoa;

public class Impressao {
    public static void imprimir(Pessoa pessoa){
        pessoa.maiorDeIdade();

        if(pessoa.getIsMaiorDeIdade()) {
            System.out.println(pessoa.getNome()+" é maior de idade.");
        } else {
            System.out.println(pessoa.getNome()+" é menor de idade.");
        }
    }
}
