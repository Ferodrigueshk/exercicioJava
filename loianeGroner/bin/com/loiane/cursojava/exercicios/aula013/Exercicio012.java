package com.loianecursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio012 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite sua altura em metros: (ex.: 1,75) ");
		double altura = scan.nextDouble();

		double pesoIdeal = (72.7 * altura) - 58;

		System.out.println("O peso ideal para a sua altura é: " + pesoIdeal + " kg");
	}

}
