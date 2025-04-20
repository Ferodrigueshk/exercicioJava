package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio027 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		char[] vetorB = new char[10];

		// Entrada de dados para o vetor A
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("A[ " + i + "] ");
			vetorA[i] = scan.nextInt();
		}

		// Construção do VetorB com base nas regras.
		for (int i = 0; i < vetorB.length; i++) {
			if (vetorA[i] < 7) {
				vetorB[i] = 'a';
			} else if (vetorA[i] == 7) {
				vetorB[i] = 'b';
			} else if (vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			} else if (vetorA[i] == 10) {
				vetorB[i] = 'd';
			} else {
				vetorB[i] = 'e';
			}
		}
		// Exibindo resultados
		System.out.println("\nResultado dos vetos: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("A[%d] = %d -> B[%d] = %c\n", i, vetorA[i], i, vetorB[i]);

		}
		scan.close();

	}

}
