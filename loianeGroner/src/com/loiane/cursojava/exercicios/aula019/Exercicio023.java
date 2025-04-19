package exercicioAula019;

import java.util.Scanner;

public class Exercicio023 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        boolean todosPares = true; // Flag começa como true, assumindo que todos são pares

        //Lendo os elementos do vetor
        System.out.println("Digite 10 números  inteiros: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
        }
        // Verificando se todos os elementos são pares
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {// Se encontrar algum par
                todosPares = false; // Atualiza a Flag
                break;
            }
        }
        // Exibindo o rsultado
        if (todosPares) {
            System.out.println("Todos elementos são pares.");
        } else {
            System.out.println("Pelo menos um dos elementos do vetor é ímpar");
        }
        scan.close();
    }
}
