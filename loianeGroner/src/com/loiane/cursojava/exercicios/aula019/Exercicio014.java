package exercicioAula019;

import java.util.Scanner;

public class Exercicio014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        //Preencendo os valores do vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite os valores do vetorA[ " + i + " ]: ");
            vetorA[i] = scan.nextInt();
        }

        //Variaveis para armazenar os impares, sua soma e realizar a contagem
        int somaImpares = 0;
        int quantidadeImpares = 0;

        // verificar quais são ímpares e acuular a soma e a contagem
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                somaImpares += vetorA[i];
                quantidadeImpares++;
            }
        }
        // Calcular e exibir a média
        if (quantidadeImpares > 0) {
            double media = (double) somaImpares / quantidadeImpares;
            System.out.println("\nMédia dos elementos ímpares: " + media);
        } else {
            System.out.println("\nNão há elementos ímpares no vetor.");
        }

        scan.close();
    }
}
