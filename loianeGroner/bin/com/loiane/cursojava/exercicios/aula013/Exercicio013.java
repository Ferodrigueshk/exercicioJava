package com.loianecursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio013 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double pesoIdeal;

		System.out.println("Digite sua altura em metros: (Ex.: 1.77)");
		double altura = scan.nextDouble();

		System.out.println("Digite seu peso em kg: (Ex.: 88.7)");
		double pesoAtual = scan.nextDouble();

		System.out.println("Digite seu sexo: (M masculino - F feminino): ");
		String sexo = scan.next();

		if (sexo.equalsIgnoreCase("M")) {
			pesoIdeal = (72.7 * altura) - 58;
		} else if (sexo.equalsIgnoreCase("F")) {
			pesoIdeal = (62.1 * altura) - 44.7;
		} else {
			System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
			scan.close();
			return;
		}

		System.out.printf("Seu peso ideal é: %.2f Kg%n", pesoIdeal);

		if (Math.abs(pesoAtual - pesoIdeal) < 0.1) {
			System.out.println("Você está dentro do peso ideal.");
		} else if (pesoAtual > pesoIdeal) {
			System.out.println("Você está acima do peso ideal.");
		} else {
			System.out.println("Você está abaixo do peso ideal.");
		}

		scan.close();
	}
}
