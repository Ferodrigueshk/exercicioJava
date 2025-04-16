package com.loiane.cursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio017 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o tamanho da área a ser pintada (em m²): ");
		double area = scan.nextDouble();

		double litrosNecessarios = area / 3;
		int qtdLatas = (int) Math.ceil(litrosNecessarios / 18);
		double precoLata = 80.0;
		double valorTotal = qtdLatas * precoLata;

		System.out.println("Área: " + area + " m²");
		System.out.println("Litros de tinta necessários: " + String.format("%.2f", litrosNecessarios) + " L");
		System.out.println("Quantidade de latas: " + qtdLatas);
		System.out.printf("Valor total: R$ %.2f%n", valorTotal);

		scan.close();
	}
}
