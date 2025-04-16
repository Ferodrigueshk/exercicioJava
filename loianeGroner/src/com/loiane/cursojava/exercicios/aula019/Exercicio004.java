package com.loiane.cursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// criar dois vetores
		int[] vetorA = new int[15];
		double[] vetorB = new double[15];

		// Pedir ao uuário para preenche o vetorA
		for (int i = 0; i < vetorB.length; i++) {
			System.out.printf("Digite o valor do elemento A[%d]: ", i);
			vetorA[i] = scan.nextInt();
		}

		// Calcular a raiz quadrada de cada elemento de A e guardar em B
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = Math.sqrt(vetorA[i]);
		}

		// Mostrar os dois valores lado a lado
		System.out.println("\nResultado: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("vetorA[%d] = %d \t vetorB[%d] = %.2f%n", i, vetorA[i], i, vetorB[i]);
		}

		scan.close();
	}

}
