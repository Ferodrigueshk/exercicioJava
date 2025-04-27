package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio038 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];

		// Entrada do vetorA
		System.out.println("Digite 10 números inteiros: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A[ " + i + "]: ");
			vetorA[i] = scan.nextInt();
		}

		// Construção do vetorB
		for (int i = 0; i < vetorA.length; i++) {
			int somatorio = 0;
			// SOmatorio de A[j], para j variando de i até 9
			for (int j = i; j < vetorA.length; j++) {
				somatorio += vetorA[j];
			}
			vetorB[i] = somatorio;
		}
		// Exibindo os resultados
		System.out.println("\nVetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

		scan.close();
	}

}
