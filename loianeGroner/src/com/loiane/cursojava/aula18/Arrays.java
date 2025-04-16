package com.loiane.cursojava.aula18;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;

		double[] temperaturas = new double[366];
		double temp[];

		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 333.1;

		System.out.println("O valor da temperatura do dia 1: " + temperaturas[0]);
		System.out.println("O valor da temperatura do dia 2: " + temperaturas[1]);
		System.out.println("O valor da temperatura do dia 3: " + temperaturas[2]);
		System.out.println("O valor da temperatura do dia 4: " + temperaturas[3]);
		System.out.println("O valor da temperatura do dia 5: " + temperaturas[4]);

		System.out.println("Tamanho do array: " + temperaturas.length);
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia: " + (i + 1) + " é: " + temperaturas[i]);

		}
		scan.close();

	}

}
