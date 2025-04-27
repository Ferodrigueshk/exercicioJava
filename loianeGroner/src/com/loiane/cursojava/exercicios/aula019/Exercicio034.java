package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio034 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];

		System.out.println("Digite 10 números inteiros: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A[" + i + "]: ");
			vetorA[i] = scan.nextInt();
		}

		// Imprimindo números e seus pares
		System.out.println("\nResultado: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("\nElementos pares de 0 até " + vetorA[i] + ":");
			for (int j = 0; j <= vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();// Pular linha depois de listar os pares
		}

		scan.close();
	}

}
