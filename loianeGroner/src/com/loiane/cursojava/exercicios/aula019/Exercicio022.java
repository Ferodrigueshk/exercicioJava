package exercicioAula019;

import java.util.Scanner;

public class Exercicio022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int quantidadeZeros = 0;
        int quantidadeUns = 0;

        // Gerando os valores aleatórios (0 ou 1)
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
            if (vetorA[i] == 0) {
                quantidadeZeros++;
            } else {
                quantidadeUns++;
            }

        }
        //Calculando os percetuais
        double percentualZeros = ((double) quantidadeZeros / vetorA.length) * 100;
        double percentualUns = ((double) quantidadeUns / vetorA.length) * 100;

        //Exibindo o vetor e os percentuais
        System.out.println("Vetor gerado: ");
        for (int valor : vetorA) {
            System.out.println(valor + " ");
        }

        System.out.printf("\n\nPercentual de 0's: %.2f%%\n", percentualZeros);
        System.out.printf("Percentual de 1's: %.2f%%\n", percentualUns);
        scan.close();
    }
}
