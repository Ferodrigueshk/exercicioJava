package com.loianecursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio014 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final double LIMITE = 50.0;
		final double VALOR_MULTA_POR_KG = 4.0;

		System.out.println("Digite o peso do peixe em Kg:");
		double peso = scan.nextDouble();

		double excesso = 0;
		double multa = 0;

		if (peso > LIMITE) {
			excesso = peso - LIMITE;
			multa = excesso * VALOR_MULTA_POR_KG;
		}

		System.out.printf("Você excedeu: %.2f Kg%n", excesso);
		System.out.printf("Multa: R$ %.2f%n", multa);

		scan.close();
	}
}
