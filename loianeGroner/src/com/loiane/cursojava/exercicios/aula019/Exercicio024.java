package exercicioAula019;

import java.util.Scanner;

public class Exercicio024 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        boolean ehPalindromo = true;

        // Lendo os elementos do vetor
        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }

        // Verificando se é palindromo
        for (int i = 0; i < vetorA.length / 2; i++) {
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                ehPalindromo = false;
                break;
            }
        }
        // Exibindo o resultado
        if (ehPalindromo) {
            System.out.println("O vetor  é palindromo. ");
        } else {
            System.out.println("O vetor NÃO é um palindromo.");
        }
        scan.close();
    }
}
