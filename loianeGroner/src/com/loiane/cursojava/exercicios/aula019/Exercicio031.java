package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio031 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[20];

		int posInicio = 0;
		int posFim = vetorB.length - 1;

		System.out.println("Digite 20 números inteiros: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("vetorA[ " + i + "]: ");
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 2 == 0) {
				vetorB[posInicio] = vetorA[i];
				posInicio++;
			} else {
				vetorB[posFim] = vetorA[i];
				posFim--;
			}
		}

		// Exibir vetorA
		System.out.println("\nVetor A:");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.printf("vetorA[%d] = %d\n", i, vetorA[i]);
		}

		// Exibindo o vetor B resultante
		System.out.println("\nVetor B (pares no inicio, impares no final): ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.printf("VetorB[%d] = %d\n", i, vetorB[i]);
		}
		scan.close();

	}

}
