package exercicio_12.resolucao2.test;

import exercicio_12.resolucao2.dominio.Produto;
import static exercicio_12.resolucao2.servico.EscolherFormaPagamento.escolherFormaPagamento;
import static exercicio_12.resolucao2.servico.ReceberValorProduto.receberValorProduto;

/* 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
 pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
 Tabela de Código de Condições de Pagamento

 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
 2 - À Vista no cartão de crédito, recebe 10% de desconto
 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%*/

public class Resolucao {
    public static void main(String[] args) {
        Produto produto = new Produto();

        receberValorProduto(produto);
        escolherFormaPagamento(produto);
    }
}