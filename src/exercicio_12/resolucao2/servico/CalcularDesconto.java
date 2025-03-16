package exercicio_12.resolucao2.servico;

import exercicio_12.resolucao2.dominio.FormaPagamento;
import exercicio_12.resolucao2.dominio.Produto;

public class CalcularDesconto {
    public static void calcularDesconto(Produto produto) {
        System.out.println("\n---------------------------------");
        System.out.println("Valor original: R$"+produto.getValor());
        System.out.println("Forma de pagamento: À vista em dinheiro ou pix.");
        System.out.println("Recebe 15% de desconto!");
        System.out.println("Novo valor: R$"+ FormaPagamento.Dinheiro_Pix.calcularDesconto(produto.getValor()));
        System.out.println("\n---------------------------------");
    }
}
