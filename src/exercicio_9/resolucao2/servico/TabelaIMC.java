package exercicio_9.resolucao2.servico;

import exercicio_9.resolucao2.dominio.Pessoa;

public class TabelaIMC {
    public static void tabelaIMC(Pessoa pessoa) {
        pessoa.calcularIMC();
        double valorIMC = pessoa.getIMC();
        if(valorIMC < 18.5) {
            System.out.println("\nAbaixo do peso.");
        } else if(valorIMC >= 18.5 && valorIMC <25) {
            System.out.println("\nPeso ideal.");
        } else if(valorIMC >= 25 && valorIMC <30) {
            System.out.println("\nLevemente acima do peso.");
        } else if(valorIMC >= 30 && valorIMC <35) {
            System.out.println("\nObesidade grau I.");
        } else if(valorIMC >= 35 && valorIMC <40) {
            System.out.println("\nObesidade grau II.");
        } else if(valorIMC>=40){
            System.out.println("\nObesidade grau III.");
        }
    }
}