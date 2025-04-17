package com.loianecursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio010 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celcius: ");
		double C = scan.nextDouble();

		double F = (C * 1.8 + 32);
		System.out.println(C + " C° = " + F + " °F");

	}

}
