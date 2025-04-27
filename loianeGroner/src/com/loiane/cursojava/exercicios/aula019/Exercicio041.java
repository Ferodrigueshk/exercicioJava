package com.loianecursojava.exercicios.aula019;

import java.util.Scanner;

public class Exercicio041 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];

		// Entrada dos 10 elementos no vetor A
		System.out.println("Digite 10 números para o vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("A[" + i + "]: ");
			vetorA[i] = scan.nextInt();
		}
		// Ler elemento X a ser pesquisado
		System.out.print("\nDigite o elemento que deseja buscar no vetor A: ");
		int x = scan.nextInt();

		// Rotina de busca
		boolean encontrado = false;
		int posicao = -1; // opcional, se quiser mostrar a posição

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == x) {
				encontrado = true;
				posicao = i;
				break; // achou, pode parar de procurar
			}
		}

		// Exibindo resultado da busca
		if (encontrado) {
			System.out.println("\nElemento " + x + " encontrado na posição " + posicao + " do vetor A.");
		} else {
			System.out.println("\nElemento " + x + " não encontrado no vetor A.");
		}
		scan.close();
	}

}
