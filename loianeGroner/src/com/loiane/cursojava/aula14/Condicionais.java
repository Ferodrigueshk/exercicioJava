package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite sua idade: ");

		int idade = scan.nextInt();

		if (idade >= 18) {
			System.out.println("Maior de idade.");
		} else {
			System.out.println("Sai fora menor.");
		}

		scan.close();
	}

}
