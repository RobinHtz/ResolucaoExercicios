package exercicio_12.resolucao2.test;

import exercicio_12.resolucao2.dominio.Produto;
import exercicio_12.resolucao2.dominio.FormaPagamento;
import exercicio_12.resolucao2.servico.CalcularDesconto;
import java.util.Scanner;

/* 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
 pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
 Tabela de Código de Condições de Pagamento

 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
 2 - À Vista no cartão de crédito, recebe 10% de desconto
 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%*/

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        Produto produto = new Produto();
        int num;

        System.out.print("Digite o valor do produto: R$");
        produto.setValor(meuScanner.nextDouble());

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
                System.out.println("Número inválido, tente novamente.");
        }
    }
}
