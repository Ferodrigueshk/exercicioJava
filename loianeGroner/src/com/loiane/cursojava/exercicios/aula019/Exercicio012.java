package exercicioAula019;

import java.util.Scanner;

public class Exercicio012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int soma = 0;

        //Preenchendo o vetor com valores do usuário
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor  do vetorA[" + i + "]: ");
            vetorA[i] = scan.nextInt();
        }
        //somando todos os elementos do vetor
        for (int i = 0; i < vetorA.length; i++) {
            soma += vetorA[i];
        }

        //Mostrando resultado
        System.out.println("\nSoma de todos os elementos do vetor: " + soma);

        scan.close();
    }


}
