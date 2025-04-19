package exercicioAula019;

import java.util.Scanner;

public class Exercicio017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] idades = new int[10];
        int quantidadeAcima35 = 0;
        //Lendo idades
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite a idade da pesso " + (i + 1) + ": ");
            idades[i] = scan.nextInt();

            if (idades[i] > 35) {
                quantidadeAcima35++;
            }
        }
        //Resultado
        System.out.println("\nQuantidade de pessoas com mais de 35 anos: " + quantidadeAcima35);
        scan.close();
    }
}
