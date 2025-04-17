package com.loianecursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio011 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int num1 = scan.nextInt();

		System.out.println("Digite outro numero inteiro: ");
		int num2 = scan.nextInt();

		System.out.println("Digite o terceiro numero: ");
		double num3 = scan.nextDouble();

		int questao1 = (num1 * 2) * (num2 / 2);
		double questao2 = (num1 * 3) + (num3);
		double questao3 = Math.pow(num3, 3);

		System.out.println("o produto do dobro do primeiro com metade do segundo: " + questao1);
		System.out.println("a soma do triplo do primeiro com o terceiro: " + questao2);
		System.out.println("o terceiro elevado ao cubo: " + questao3);

	}

}
