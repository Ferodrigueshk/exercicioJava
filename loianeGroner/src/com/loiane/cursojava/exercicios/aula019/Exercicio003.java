package com.loiane.cursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Criar os 2 vetores com 15 posiçoes

		int[] vetorA = new int[15];
		int[] vetorB = new int[15];

		// Preencher o vetor A com valores informados pelo Usuário
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Digite o %dº número para o vetor A", i + i);
			vetorA[i] = scan.nextInt();
		}

		// Calcular o quadrado de cada elemento de A e armazenar em B
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		// Exibir os dois vetores lado a lado
		System.out.println("\nValores dos vetores A e B (B[i] = A[i]²): ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("A[%d] = %d \t→ B[%d] = %d%n", i, vetorA[i], i, vetorB[i]);
		}

		scan.close();
	}

}
