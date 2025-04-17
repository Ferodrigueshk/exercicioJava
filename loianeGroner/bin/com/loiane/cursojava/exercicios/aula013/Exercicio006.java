package com.loianecursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do raio: ");
		double raio = scan.nextDouble();
		double pi = Math.PI;

		double area = Math.PI * Math.pow(raio, 2);

		System.out.println("Se o raio for: " + raio + " a área equivale: " + area);
		System.out.println("Pi = " + pi);
	}

}
