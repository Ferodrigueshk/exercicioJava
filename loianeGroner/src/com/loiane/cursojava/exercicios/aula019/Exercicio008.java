package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio008 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		// Preenchendo os valores de vetorA e vetorB
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor para vetorA[ " + i + " ]: ");
			vetorA[i] = scan.nextInt();

			System.out.println("Digite o valor para vetorB[ " + i + " ]: ");
			vetorB[i] = scan.nextInt();
		}

		// Calculando os valores de VetorC = vetorA * vetorB
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
		}

		// Exibindo os valores dos 3 vetores
		System.out.println("\nExibindo o resultado da multiplicação de vetorA e vetorB: ");
		for (int i = 0; i < vetorC.length; i++) {
			/*
			 * System.out.println( "A[" + i + "] = " + vetorA[i] + ", B[" + i + "] = " +
			 * vetorB[i] + ", C[" + i + "] = " + vetorC[i]);
			 */
			System.out.printf("A[%d] = %d, B[%d] = %d, C[%d] = %d\n", i, vetorA[i], i, vetorB[i], i, vetorC[i]);

		}

		scan.close();
	}
}
