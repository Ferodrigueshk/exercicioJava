package com.loianecursojava.exercicios.aula019;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio042 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];

		// Entrada dos 10 elementos no vetor A
		System.out.println("Digite 10 números para o vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("A[" + i + "]: ");
			vetorA[i] = scan.nextInt();
		}

		// Ordenando o vetor
		Arrays.sort(vetorA);

		// Exibindo o vetor ordenado
		System.out.println("\nVetor A em ordem crescente:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		scan.close();

	}
}
