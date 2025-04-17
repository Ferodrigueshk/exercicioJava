package com.loianecursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a nota 1: ");
		double nota1 = scan.nextDouble();

		System.out.println("Digite a nota 2: ");
		double nota2 = scan.nextDouble();

		System.out.println("Digite a nota 3: ");
		double nota3 = scan.nextDouble();

		System.out.println("Digite a nota 4: ");
		double nota4 = scan.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Nota 3: " + nota3);
		System.out.println("Nota 4: " + nota4);
		System.out.println("Media Final: " + media);

	}

}
