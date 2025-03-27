package exercicio_16;

import java.util.Scanner;

//16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//equilátero, isósceles ou escaleno.

public class Resolucao {
    public static void main(String[] args) {
        retornarTipoTriangulo(leitorTriangulo());
    }

    public static double[] leitorTriangulo() {
        Scanner meuScanner = new Scanner(System.in);
        double [] ladosTriangulo= new double[3];

        System.out.print("Digite um lado do triângulo: ");
        ladosTriangulo[0] = meuScanner.nextDouble();
        System.out.print("Digite outro lado do triângulo: ");
        ladosTriangulo[1] = meuScanner.nextDouble();
        System.out.print("Digite o último lado do triângulo: ");
        ladosTriangulo[2] = meuScanner.nextDouble();

        if(ladosTriangulo[0]+ladosTriangulo[1]<ladosTriangulo[2] || ladosTriangulo[0]+ladosTriangulo[2]<ladosTriangulo[1] || ladosTriangulo[1]+ladosTriangulo[2]<ladosTriangulo[0]) {
            System.out.println("\nTriângulo inválido, o programa será reiniciado.\n");
            leitorTriangulo();
        }
        return ladosTriangulo;
    }

    public static void retornarTipoTriangulo(double[] ladosTriangulo) {
        if(ladosTriangulo[0]!=ladosTriangulo[1] && ladosTriangulo[0]!=ladosTriangulo[2] && ladosTriangulo[2]!=ladosTriangulo[1]) {
            System.out.println("\nTriângulo escaleno.");
        } else if(ladosTriangulo[0]==ladosTriangulo[1] && ladosTriangulo[1]==ladosTriangulo[2]) {
            System.out.println("\nTriângulo equilátero.");
        } else {
            System.out.println("\nTriângulo isósceles.");
        }
    }
}
