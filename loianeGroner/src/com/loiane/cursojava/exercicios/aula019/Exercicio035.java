package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio035 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];

		// Entrada de dados
		System.out.println("Digite 10 números inteiros: ");
		for (int i = 0; i < vetorA.length; i++) { // começa no 0
			System.out.println("A[" + i + "]: ");
			vetorA[i] = scan.nextInt();
		}

		// Imprimindo números e seus divisores
		System.out.println("\nResultado: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("\nDivisores de " + vetorA[i] + ":");
			for (int j = 1; j <= vetorA[i]; j++) { // vai até o número
				if (vetorA[i] % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println(); // pular linha entre números
		}
		scan.close();
	}
}
