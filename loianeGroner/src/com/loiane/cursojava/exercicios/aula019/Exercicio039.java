package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio039 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		int cIndex = 0;

		// Entrada dos vetores A e B
		System.out.println("Digite números para o vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("A[" + i + "]: ");
			vetorA[i] = scan.nextInt();
		}

		System.out.println("\nDigite 10 números para o vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("B[" + i + "]: ");
			vetorB[i] = scan.nextInt();
		}

		// Construção do vetor C ( interseção de A e B)
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] == vetorB[j]) {
					boolean jaExiste = false;
					for (int k = 0; k < cIndex; k++) {
						if (vetorC[k] == vetorA[i]) {
							jaExiste = true;
							break;
						}
					}
					if (!jaExiste) {
						vetorC[cIndex] = vetorA[i];
						cIndex++;
					}
				}
			}
		}
		// Exibindo os resultados
		System.out.println("\nVetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("\n\nVetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

		System.out.println("\n\nInterseção (vetor C): ");
		if (cIndex == 0) {
			System.out.println("Não há elementos em comum. ");
		} else {
			for (int i = 0; i < cIndex; i++) {
				System.out.print(vetorC[i] + " ");
			}
		}
		scan.close();
	}

}
