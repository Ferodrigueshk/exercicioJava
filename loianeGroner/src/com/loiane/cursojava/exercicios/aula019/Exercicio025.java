package exercicioAula019;

import java.util.Scanner;

public class Exercicio025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        // Ler os 10 numeros do vetor A
        System.out.println("Digite 10numeros inteiros");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
        }

        // Preencher o vetor B conforme regra de par/ímpar
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1; // par
            } else {
                vetorB[i] = 0; //Ímpar
            }
        }

        // Exibir os dois vetores
        System.out.println("\nVetor A: ");
        for (int valor : vetorA) {
            System.out.println(valor + " ");
        }
        System.out.println("\n\nvetor B (1= par, 0 = ímpar): ");
        for (int valor : vetorB) {
            System.out.println(valor + " ");
        }
        scan.close();
    }
}
