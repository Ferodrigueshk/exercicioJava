package com.loianecursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio015 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Valor da hora trabalhada: R$: ");
		double valorHora = scan.nextDouble();

		System.out.println("Horas trabalhadas no mês: ");
		double horasTrabalhadas = scan.nextDouble();
		double salarioBruto = horasTrabalhadas * valorHora;

		final double TAXA_IR = 0.11;
		final double TAXA_INSS = 0.08;
		final double TAXA_SINDICATO = 0.05;

		double descontoIR = salarioBruto * TAXA_IR;
		double descontoINSS = salarioBruto * TAXA_INSS;
		double descontoSindicato = salarioBruto * TAXA_SINDICATO;

		double salarioLiquido = salarioBruto - (descontoIR + descontoINSS + descontoSindicato);

		System.out.println("\n+ Salário Bruto   : R$ " + String.format("%.2f", salarioBruto));
		System.out.println("- IR (11%)        : R$ " + String.format("%.2f", descontoIR));
		System.out.println("- INSS (8%)       : R$ " + String.format("%.2f", descontoINSS));
		System.out.println("- Sindicato (5%)  : R$ " + String.format("%.2f", descontoSindicato));
		System.out.println("= Salário Líquido : R$ " + String.format("%.2f", salarioLiquido));

		scan.close();
	}

}
