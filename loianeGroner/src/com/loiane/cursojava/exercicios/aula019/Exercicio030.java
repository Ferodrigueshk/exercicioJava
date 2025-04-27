package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio030 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[20]; // Pares
		int[] vetorC = new int[20]; // Ímpares

		int contPares = 0;
		int contImpares = 0;

		System.out.println("Digite 20 números inteiros: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("A[" + i + "]: ");
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 2 == 0) {
				vetorB[contPares] = vetorA[i];
				contPares++;
			} else {
				vetorC[contImpares] = vetorA[i];
				contImpares++;
			}
		}

		// Exibir A
		System.out.println("\nVetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("A[%d] = %d\n", i, vetorA[i]);
		}

		// Exibir vetor pares (B)
		System.out.println("\nElementos pares (vetor B):");
		for (int i = 0; i < contPares; i++) {
			System.out.printf("B[%d] = %d\n", i, vetorB[i]);
		}

		// Exibir vetor impares (C)
		System.out.println("\nElementos ímpares (vetor C):");
		for (int i = 0; i < contImpares; i++) {
			System.out.printf("C[%d] = %d\n", i, vetorC[i]);
		}

		scan.close();
	}
}
