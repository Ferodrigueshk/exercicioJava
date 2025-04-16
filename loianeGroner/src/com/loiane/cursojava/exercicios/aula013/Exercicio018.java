package com.loiane.cursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio018 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Entrada do tamanho do arquivo
		System.out.print("Digite o tamanho do arquivo (em MB): ");
		double tamanhoArquivoMB = scan.nextDouble();

		// Entrada da velocidade do link
		System.out.print("Digite a velocidade da internet (em Mbps): ");
		double velocidadeMbps = scan.nextDouble();

		// Conversão de Mbps para MBps (1 Byte = 8 bits)
		double velocidadeMBps = velocidadeMbps / 8;

		// Cálculo do tempo em segundos
		double tempoSegundos = tamanhoArquivoMB / velocidadeMBps;

		// Conversão para minutos
		double tempoMinutos = tempoSegundos / 60;

		// Exibindo o resultado
		System.out.printf("Tempo aproximado de download: %.2f minutos%n", tempoMinutos);

		scan.close();
	}
}
