package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio026 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		// Lendo os valores do vetorA
		System.out.println("Digite os 10 numeros inteiros do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("A[ " + i + "]: ");
			vetorA[i] = scan.nextInt();
		}

		// Lendo os elementos do vetor B
		System.out.print("\nDigite 10 numeros inteiros no vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("B[ " + i + "]: ");
			vetorB[i] = scan.nextInt();
		}

		// Construir o vetor com base nas comparações
		for (int i = 0; i < vetorC.length; i++) {
			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else {
				vetorC[i] = -1;
			}
		}

		// Exibindo os vetores:
		System.out.println("\nResultado dos vetores: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("A[%d] = %d | B[%d] = %d => c[%d] = %d\n", i, vetorA[i], i, vetorB[i], i, vetorC[i]);
		}
		scan.close();
	}

}
