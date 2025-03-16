package exercicio_12.resolucao1;

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
        double valorProduto;
        int num;

        System.out.print("Digite o valor do produto: ");
        valorProduto = meuScanner.nextDouble();

        System.out.println("\nFormas de pagamento:");
        System.out.println("1 - À vista em dinheiro ou pix, recebe 15% de desconto ");
        System.out.println("2 - À vista no cartão de crédito, recebe 10% de desconto ");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros ");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10% ");

        System.out.print("\nEscolha o número referente a forma de pagamento: ");
        num = meuScanner.nextInt();
        System.out.println();

        switch(num) {
            case 1:
                valorProduto = valorProduto-(valorProduto*0.15);
                System.out.println("Pagamento à vista em dinheiro ou pix.");
                System.out.println("Valor do produto com 15% de desconto: R$ "+valorProduto);
                break;
            case 2:
                valorProduto = valorProduto-(valorProduto*0.10);
                System.out.println("Pagamento à vista no cartão de crédito.");
                System.out.println("Valor do produto com 10% de desconto: R$ "+valorProduto);
                break;
            case 3:
                System.out.println("Parcelado no cartão em duas vezes.");
                System.out.println("Valor do produto: R$ "+valorProduto);
                break;
            case 4:
                valorProduto = valorProduto+(valorProduto*0.10);
                System.out.println("Parcelado no cartão em três vezes ou mais.");
                System.out.println("Valor do produto com 10% de juros: R$ "+valorProduto);
                break;
            default:
                System.out.println("Número inválido.");
                System.out.println("Tente novamente.");
        }
    }
}
