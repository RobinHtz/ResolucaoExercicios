package exercicio_24;

import java.util.Scanner;

/*
Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro.
Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.

Fórmula: distância = tempo x velocidade.

            litros usados = distância / 12.
 */

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Qual a distância em quilometros?");
        double distancia = meuScanner.nextDouble();

        System.out.println("Quantas horas até o destino?");
        double tempo = meuScanner.nextDouble();

        double velocidadeMedia = distancia / tempo;
        double quantidadeLitrosUsado = distancia/12;

        System.out.println("\nTempo de viagem: "+tempo+" horas.");
        System.out.printf("Velocidade média: %.0f km/h.\n",velocidadeMedia);
        System.out.println("Distância total: "+distancia+" km.");
        System.out.println("Quantidade de litros utilizados: "+quantidadeLitrosUsado+" L.");
    }
}
