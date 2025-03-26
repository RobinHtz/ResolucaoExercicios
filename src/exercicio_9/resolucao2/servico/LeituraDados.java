package exercicio_9.resolucao2.servico;

import exercicio_9.resolucao2.dominio.Pessoa;

import java.util.Scanner;

public class LeituraDados {
    static Scanner meuScanner = new Scanner(System.in);

    public static void lerDados(Pessoa pessoa) {
        lerPeso(pessoa);
        lerAltura(pessoa);
    }

    public static void lerPeso(Pessoa pessoa) {
        System.out.print("Digite seu peso: ");
        double peso = meuScanner.nextDouble();
        if(peso>0) {
            pessoa.setPeso(peso);
        } else {
            System.out.println("\nPor favor digite um peso que exista.");
            lerPeso(pessoa);
        }
    }

    public static void lerAltura(Pessoa pessoa) {
        System.out.print("Digite sua altura: ");
        double altura = meuScanner.nextDouble();
        if(altura>0) {
            pessoa.setAltura(altura);
        } else {
            System.out.println("Por favor digite uma altura que exista.");
            lerAltura(pessoa);
        }
    }
}