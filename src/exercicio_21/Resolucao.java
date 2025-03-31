package exercicio_21;

import java.util.Random;

//Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

public class Resolucao {
    public static void main(String[] args) {
        Random random = new Random();
        int numRandom = random.nextInt(101);
        System.out.println(numRandom);
    }
}
