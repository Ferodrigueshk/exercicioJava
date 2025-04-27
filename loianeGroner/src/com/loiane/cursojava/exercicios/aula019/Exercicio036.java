package com.loianecursojava.exercicios.aula019;

public class Exercicio036 {
	public static void main(String[] args) {

		int[] vetorA = new int[11];

		// Preencher o vetor com 2^i
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.pow(2, i);//
		}
		// Imprimir vetor
		System.out.println("Vetor A(2^i): ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A[" + i + "] = " + vetorA[i]);
		}
	}
}
