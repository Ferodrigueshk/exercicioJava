package exercicioAula019;

import java.util.Scanner;

public class Exercicio016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        int somaMenores15 = 0;
        int quantidadeIguais15 = 0;
        int somaMaiores15 = 0;
        int quantidadeMaiores15 = 0;

        //lendo o vetor e ja passando os valores
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetorA[ " + i + " ]: ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] < 15) {
                somaMenores15 += vetorA[i];
            } else if (vetorA[i] == 15) {
                quantidadeIguais15++;
            } else { // maior que 15
                somaMaiores15 += vetorA[i];
                quantidadeMaiores15++;
            }
        }

        //Calculando media maiores  que  15
        double mediaMaiores15 = 0;
        if (quantidadeMaiores15 > 0){
            mediaMaiores15 = (double) somaMenores15 / quantidadeMaiores15;
        }

        //Exibindo resultados
        System.out.println("\nSoma dos elementos < 15: " + somaMenores15);
        System.out.println("\nSoma dos elementos < 15: " + quantidadeIguais15);
        System.out.printf("Média dos elementos > 15: %2f\n ",mediaMaiores15 );
        scan.close();
    }
}
