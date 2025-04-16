package com.loiane.cursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[5];

		// prenecer o vetor A com os valores informados pelo usuário

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição " + i + " dovetor A: ");
			vetorA[i] = scan.nextInt();
		}

		// Copiar os valores de A para B
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i];
		}

		// Mostrar os vetores A e B
		System.out.println("\nVetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println("\n\nVetor B (cópia de A):");

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i] + " ");
		}
		scan.close();

	}

}
