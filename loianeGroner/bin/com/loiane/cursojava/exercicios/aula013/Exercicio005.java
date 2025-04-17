package com.loianecursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Esse app converte metros em centimetros");
		System.out.println("Quantos metros voce deseja converter para Centimetros? ");
		double metros = scan.nextDouble();

		double centimetros = metros * 100;

		System.out.println(metros + " equivalem a " + centimetros + " centimetros");

	}

}
