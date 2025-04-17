package com.loianecursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		int num1 = scan.nextInt();

		System.out.println("Digite outro: ");
		int num2 = scan.nextInt();
		int soma = num1 + num2;
		System.out.println("A soma entre eles é: " + soma);

	}

}
