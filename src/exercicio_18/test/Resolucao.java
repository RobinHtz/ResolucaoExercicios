package exercicio_18.test;

import exercicio_18.dominio.Pessoa;

/*
 Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
 Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
 */

public class Resolucao {
    public static void main(String[] args) {
        Pessoa francisco = new Pessoa("Francisco", 1.5, 0.02);
        Pessoa sara = new Pessoa("Sara", 1.1, 0.03);
        int ano = 2025;

        calculo(francisco,sara,ano);
    }

    public static void calculo(Pessoa francisco, Pessoa sara, int ano) {
        System.out.printf("Ano inicial: %d \nAltura inicial Francisco: %.2f m.\nAltura inicial Sara: %.2f m.\n",ano,francisco.getAltura(),sara.getAltura());

        while(francisco.getAltura()>sara.getAltura()) {
            ano++;
            francisco.crescer();
            sara.crescer();
        }

        resultado(francisco,sara,ano);
    }

    public static void resultado(Pessoa francisco, Pessoa sara, int ano) {
        System.out.printf("\nAno final: %d \nAltura final Francisco: %.2f m.\nAltura final Sara: %.2f m.\n",ano,francisco.getAltura(),sara.getAltura());

        System.out.print("\nDemorou "+(ano-2025)+" anos para Sara ficar mais alto que Francisco.");
    }
}
