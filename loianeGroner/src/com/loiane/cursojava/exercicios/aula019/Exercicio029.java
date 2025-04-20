package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio029 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[20]; // Vetor C com o dobro do tamanho

		// Lendo os valores de A
		System.out.println("Digite 10 valores para o vetor A ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A[ " + i + " ]: ");
			vetorA[i] = scan.nextInt();
		}

		// Lendo os valores de B
		System.out.println("\nDigite 10 valores para o vetorB: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("B[ " + i + " ]: ");
			vetorB[i] = scan.nextInt();
		}

		// Copiando A para C
		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i];
		}

		// Copiando B para C ( a partir da posição 10)
		for (int i = 0; i < vetorB.length; i++) {
			vetorC[i + 10] = vetorB[i];
		}

		// Imprimindo o vetor C
		System.out.println("\nVetor C (junção de A e B): ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.printf("C[%d] = %d\n", i, vetorC[i]);
		}

		scan.close();
	}
}
