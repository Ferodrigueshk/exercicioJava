package com.loiane.cursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Criar os vetores A e B
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];

		// Preencher o VetorA com dados do Usuário
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor para a posição[" + i + "]:");
			vetorA[i] = scan.nextInt();
		}

		// calcular valores do vetorB
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * i; // multiplica o valor de A[i] pelo i
		}

		// Mostrar os vetores A e B lado a lado
		System.out.println();
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("VetorA [" + i + " ] = " + vetorA[i] + " | vetorB [" + i + "]" + vetorB[i]);

		}

		scan.close();
	}

}
