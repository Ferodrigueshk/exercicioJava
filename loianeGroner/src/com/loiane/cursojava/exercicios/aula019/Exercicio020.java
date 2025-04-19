package exercicioAula019;

import java.util.Scanner;

public class Exercicio020 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];

        // Lendo a cotação do dolar
        System.out.println("Digite a cotação do dolar (U$ -> R$): ");
        double cotacaoDolar = scan.nextDouble();

        //Preenchendo o vetor com as conversões

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacaoDolar * (i + 1);
        }

        //Mostrando tabela de conversão
        System.out.println("\n--- Conversão de Dólares para Reais ---");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%2d U$ = R$%.2f\n", (i + 1), vetorA[i]);
        }

        scan.close();

    }
}
