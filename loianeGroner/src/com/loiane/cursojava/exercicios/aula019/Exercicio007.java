package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		// Preencehendo os vetores A e B
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor para vetorA[ " + i + "]: ");
			vetorA[i] = scan.nextInt();

			System.out.println("Digite o valor para vetorB[ " + i + "]: ");
			vetorB[i] = scan.nextInt();
		}

		// Valores do vetorC = vetorA - vetorB

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
		}

		// Exibindo os 3 vetores ladao a lado
		System.out.println("\nResultado da SUbtração do Vetor A  e VetorB: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(
					"A[" + i + "] = " + vetorA[i] + ", B[" + i + "] = " + vetorB[i] + ", C[" + i + "] = " + vetorC[i]);
		}

		scan.close();
	}

}
