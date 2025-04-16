package com.loiane.cursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Criando os vetores
		int[] A = new int[8];
		int[] B = new int[8];

		// Pedindo ao User para digitar os valores do Vetor A
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite o valor da posição " + i + " do vetor A.");
			A[i] = scan.nextInt();
		}

		// Calculando os valores do VetorB
		for (int i = 0; i < B.length; i++) {
			B[i] = A[i] * 2;
		}

		// Mostrar os dois valores
		System.out.println("\nVetorA | VetorB");
		for (int i = 0; i < A.length; i++) {
			System.out.println("  " + A[i] + "   |  " + B[i]);

		}
		scan.close();
	}

}
