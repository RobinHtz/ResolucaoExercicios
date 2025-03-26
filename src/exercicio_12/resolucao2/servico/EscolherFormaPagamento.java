package exercicio_12.resolucao2.servico;

import exercicio_12.resolucao2.dominio.Produto;
import exercicio_12.resolucao2.dominio.FormaPagamento;

import java.util.Scanner;

public class EscolherFormaPagamento {
    public static void escolherFormaPagamento(Produto produto) {
        Scanner meuScanner = new Scanner(System.in);
        int num;

        System.out.println("\nFormas de pagamento:");
        System.out.println("1 - À vista em dinheiro ou pix, recebe 15% de desconto ");
        System.out.println("2 - À vista no cartão de crédito, recebe 10% de desconto ");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros ");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10% ");

        System.out.print("\nEscolha o número referente a forma de pagamento: ");
        num = meuScanner.nextInt();

        switch (num) {
            case 1:
                produto.setFormaPagamento(FormaPagamento.Dinheiro_Pix);
                CalcularDesconto.calcularDesconto(produto);
                break;
            case 2:
                produto.setFormaPagamento(FormaPagamento.Credito_1x);
                CalcularDesconto.calcularDesconto(produto);
                break;
            case 3:
                produto.setFormaPagamento(FormaPagamento.Credito_2x);
                CalcularDesconto.calcularDesconto(produto);
                break;
            case 4:
                produto.setFormaPagamento(FormaPagamento.Credito_3x);
                CalcularDesconto.calcularDesconto(produto);
                break;
            default:
                System.out.println("\nNúmero inválido, tente novamente.");
                escolherFormaPagamento(produto);
        }
    }
}