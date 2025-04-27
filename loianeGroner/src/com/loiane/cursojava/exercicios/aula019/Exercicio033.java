package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio033 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];

		// Entrada de dados
		System.out.println("Digite 10 números inteiros: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A[" + i + "]: ");
			vetorA[i] = scan.nextInt();
		}

		// Verificando se os numeros são primos
		System.out.println("\nResultado: ");
		for (int i = 0; i < vetorA.length; i++) {
			if (ehPrimo(vetorA[i])) {
				System.out.println(vetorA[i] + " é um número primo");
			} else {
				System.out.println(vetorA[i] + " não é primo");
			}
		}

		scan.close();
	}

	// Função auxiliar para verificar se um número
	public static boolean ehPrimo(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}