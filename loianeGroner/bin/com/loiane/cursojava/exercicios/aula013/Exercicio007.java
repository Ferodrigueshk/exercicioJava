package com.loianecursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio007 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do lado do quadrado: ");
		double lado = scan.nextDouble();
		System.out.println("lado = " + lado);

		double area = lado * lado;
		double dobroArea = area * 2;

		System.out.println("Area = " + area);
		System.out.println("O dobro da área: " + dobroArea);

	}

}
