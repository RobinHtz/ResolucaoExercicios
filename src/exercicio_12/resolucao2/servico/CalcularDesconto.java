package exercicio_12.resolucao2.servico;

import exercicio_12.resolucao2.dominio.FormaPagamento;
import exercicio_12.resolucao2.dominio.Produto;

public class CalcularDesconto {
    public static void calcularDesconto(Produto produto) {
        System.out.println("\n---------------------------------");
        System.out.println("Relatório de Compra do Produto");
        System.out.println("---------------------------------");
        System.out.println("Valor original: R$"+produto.getValor());

        if(produto.getFormaPagamento()==FormaPagamento.Dinheiro_Pix) {
            System.out.println("Forma de pagamento: À vista em dinheiro ou pix.");
            System.out.println("Recebe 15% de desconto!");
            System.out.println("Novo valor: R$"+ FormaPagamento.Dinheiro_Pix.calcularDesconto(produto.getValor()));
        } else if(produto.getFormaPagamento()==FormaPagamento.Credito_1x) {
            System.out.println("Forma de pagamento: À vista no cartão de crédito");
            System.out.println("Recebe 10% de desconto!");
            System.out.println("Novo valor: R$"+FormaPagamento.Credito_1x.calcularDesconto(produto.getValor()));
        } else if(produto.getFormaPagamento()==FormaPagamento.Credito_2x) {
            System.out.println("Forma de pagamento: Parcelado no cartão em duas vezes");
            System.out.println("Preço normal do produto sem juros.");
            System.out.println("Valor: R$"+FormaPagamento.Credito_2x.calcularDesconto(produto.getValor()));
        } else if(produto.getFormaPagamento()==FormaPagamento.Credito_3x) {
            System.out.println("Forma de pagamento: Parcelado no cartão em três vezes ou mais");
            System.out.println("Preço normal do produto mais juros de 10%.");
            System.out.println("Novo valor: R$"+FormaPagamento.Credito_3x.calcularDesconto(produto.getValor()));
        }
        System.out.println("---------------------------------");
    }
}
