package exercicio_19;

// Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class Resultado {
    public static void main(String[] args) {
        for(int tabuada = 1; tabuada <= 10; tabuada++) {
            System.out.println("Tabuada do número " + tabuada);
            for(int vezes = 1; vezes <= 10; vezes++) {
                int multiplicacao = tabuada*vezes;
                System.out.println(tabuada + " x " + vezes + " = " + multiplicacao);
            }
            System.out.println();
        }
    }
}
