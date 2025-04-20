package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio028 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];

		// Entrada de dados para o vetor A
		System.out.println("Digite 10 numeros inteiros para o vetorA: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("A[ " + i + " ]: ");
			vetorA[i] = scan.nextInt();
		}

		// Preenchendo o vetorB com os elementos invertidos de A
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[vetorA.length - 1 - i];
		}

		// Exibindo os dois vetores
		System.out.println("\nVetor A e seu correspondente invertido no vetorB: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("A[%d] = %d -> B[%d] = %d\n", i, vetorA[i], i, vetorB[i]);
		}
		scan.close();
	}
}
