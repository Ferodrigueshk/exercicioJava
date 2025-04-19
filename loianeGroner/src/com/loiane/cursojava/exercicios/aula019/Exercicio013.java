package exercicioAula019;

import java.util.Scanner;

public class Exercicio013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        //preenchendo o vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor de vetorA[" + i + "]: ");
            vetorA[i] = scan.nextInt();
        }
        //Criando variavel para armazenar a soma dos multiplos de 5
        int somaMultiplos5 = 0;


        //verificando e somando os multiplos de 5
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 == 0)
                somaMultiplos5 += vetorA[i];
        }
        // Exibindo resultado
        System.out.println("\nSoma dos elementos múltiplos de 5: " + somaMultiplos5);

        scan.close();
    }

}
