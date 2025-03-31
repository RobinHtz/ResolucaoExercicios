package exercicio_15;

import java.util.Scanner;

/*15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
consideração o ano com 365 dias e o mês com 30 dias.
(Ex: 5 anos, 2 meses e 15 dias de vida)*/

public class Resolucao {
    public static void main(String[] args) {
        int anoNascimento = lerAnoNascimento();
        calcular(anoNascimento);
    }

    public static int lerAnoNascimento() {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        return meuScanner.nextInt();
    }

    public static void calcular(int anoNascimento) {
        int anos = 2025 - anoNascimento;
        int meses = anos * 12;
        int dias = anos * 365;

        System.out.println("Você viveu:");
        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias.");
    }
}
