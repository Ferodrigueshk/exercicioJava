package com.loiane.cursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Criar vetores ABC com 10 posições
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		// Preencher os vetores A e B
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A na posicao " + i + ": ");
			vetorA[i] = scan.nextInt();

			System.out.println("Digite o valor do vetor B na posicao " + i + ": ");
			vetorB[i] = scan.nextInt();
		}
		// Calcular os valores do vetorC (c[i] = vatorA[i] + vetorB[i])

		System.out.println("\nValores dos vetores A, B e C: ");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		// Exibir os valores lado a lado
		System.out.println("\nValores dos vetores A, B e C:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("vetorA[" + i + "] = " + vetorA[i] + 
					" | vetorB[" + i + "] = " + vetorB[i] + 
					" | vetorC[" + i + "] = " + vetorC[i]);

		}

		scan.close();
	}

}
