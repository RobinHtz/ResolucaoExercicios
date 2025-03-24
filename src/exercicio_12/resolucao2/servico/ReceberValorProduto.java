package exercicio_12.resolucao2.servico;

import exercicio_12.resolucao2.dominio.Produto;

import java.util.Scanner;

public class ReceberValorProduto {
    public static void receberValorProduto(Produto produto) {
        Scanner meuScanner = new Scanner(System.in);
        double valor;

        System.out.print("Digite o valor do produto: R$");
        valor = meuScanner.nextDouble();
        if(valor > 0) {
            produto.setValor(valor);
        } else {
            System.out.println("Valor inválido, por favor digite um valor maior que 0.\n");
            receberValorProduto(produto);
        }
    }
}