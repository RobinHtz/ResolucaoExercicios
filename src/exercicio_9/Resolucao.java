package exercicio_9;

import java.util.Scanner;

/*9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
de acordo com a tabela abaixo:

Fórmula do IMC = peso / (altura) ²

Tabela Condições IMC

 Abaixo de 18,5   | Abaixo do peso
 Entre 18,6 e 24,9 | Peso ideal (parabéns)
 Entre 25,0 e 29,9 | Levemente acima do peso
 Entre 30,0 e 34,9 | Obesidade grau I
 Entre 35,0 e 39,9 | Obesidade grau II (severa)
 Maior ou igual a 40 | Obesidade grau III (mórbida) */

public class Resolucao {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        double altura, peso, valorIMC;

        System.out.print("Digite sua altura: ");
        altura = meuScanner.nextDouble();
        System.out.print("Digite seu peso: ");
        peso = meuScanner.nextDouble();

        valorIMC = peso / (altura*altura);

        if(valorIMC < 18.5) {
            System.out.println("\nAbaixo do peso.");
        } else if(valorIMC >= 18.5 && valorIMC <25) {
            System.out.println("\nPeso ideal.");
        } else if(valorIMC >= 25 && valorIMC <30) {
            System.out.println("\nLevemente acima do peso.");
        } else if(valorIMC >= 30 && valorIMC <35) {
            System.out.println("\nObesidade grau I.");
        } else if(valorIMC >= 35 && valorIMC <40) {
            System.out.println("\nObesidade grau II (severa).");
        } else if(valorIMC>=40){
            System.out.println("\nObesidade grau III (mórbida).");
        }
    }
}
