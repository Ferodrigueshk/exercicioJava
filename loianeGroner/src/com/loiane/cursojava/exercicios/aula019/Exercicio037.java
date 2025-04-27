package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio037 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];

		// ENtrada dos valores do Vetor A
		System.out.println("Digite 15 numeros inteiros: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("vetorA[" + i + "] :");
			vetorA[i] = scan.nextInt();
		}

		// Calculando Fatorial de cada elemento de A e armazenando em B
		for (int i = 0; i < vetorA.length; i++) {
			int fatorial = 1;
			for (int j = 1; j <= vetorA[i]; j++) {
				fatorial *= j;
			}
			vetorB[i] = fatorial;
		}

		// Imprimindo os vetores A e B
		System.out.println("\nResultados: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("VetorA[" + i + "] = " + vetorA[i] + " -> Fatorial (vetorB[" + i + "]) = " + vetorB[i]);
		}
		scan.close();
	}
}
