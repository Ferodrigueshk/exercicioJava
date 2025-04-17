package com.loianecursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio008 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora? $: ");
		double valorHora = scan.nextDouble();

		System.out.println("Quantas horas você trabalhou esse mês: ");
		double horasTrabalhadas = scan.nextDouble();

		double salario = horasTrabalhadas * valorHora;

		System.out.println("Salário: R$" + salario);

	}

}
