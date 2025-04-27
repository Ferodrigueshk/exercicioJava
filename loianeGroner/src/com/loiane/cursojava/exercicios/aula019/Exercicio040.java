package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio040 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		int cIndex = 0;

		// ENtrada dos vetores A e B
		System.out.print("Digite 10 números para o vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("A[" + i + "]: ");
			vetorA[i] = scan.nextInt();
		}

		System.out.println("\nDigite 10 números para o vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("B[" + i + "]: ");
			vetorB[i] = scan.nextInt();
		}

		// Construção do vetor C (diferença de A - B )
		for (int i = 0; i < vetorA.length; i++) {
			boolean existemEmB = false;
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] == vetorB[i]) {
					existemEmB = true;
					break;
				}
			}
			if (!existemEmB) {
				vetorC[cIndex] = vetorA[i];
				cIndex++;
			}

		}

		// Exibindo resultados
		System.out.println("\nVetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("\n\nVetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

		System.out.println("\n\nDiferença (vetor C -  elementos de A que não estão em B):");
		if (cIndex == 0) {
			System.out.println("Não há elementos exclusivos em A.");
		} else {
			for (int i = 0; i < cIndex; i++) {
				System.out.print(vetorC[i] + " ");
			}
		}
		System.out.println();
		scan.close();
	}
}
