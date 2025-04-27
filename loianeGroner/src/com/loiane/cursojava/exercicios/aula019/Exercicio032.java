package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio032 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];

		// Entrada de dados
		System.out.println("Digite  5 numeros inteiros para gerar a tabuada");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A[" + i + "]: ");
			vetorA[i] = scan.nextInt();
		}

		// imprimindo tabuadas
		System.out.println("\nTabuadas: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("\nTabuada de " + vetorA[i] + ":");
			for (int j = 0; j <= 10; j++) {
				System.out.printf("%d X %d = %d\n", vetorA[i], j, vetorA[i] * j);
			}
		}

		scan.close();
	}

}
