package exercicioAula019;

import java.util.Scanner;

public class Exercicio009 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // criando os vetores
        double[] vetorA = new double[10];
        double[] vetorB = new double[10];
        double[] vetorC = new double[10];

        // Preenchendo os vetores A e B:
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor para A[" + i + "]: ");
            vetorA[i] = scan.nextDouble();

            System.out.println("Digite o valor para B[" + i + "]: ");
            vetorB[i] = scan.nextDouble();
        }

        // Preenchendo os valores do vetorC = vetorA / vetorB
        for (int i = 0; i < vetorC.length; i++) {
            if (vetorB[i] != 0) {
                vetorC[i] = vetorA[i] / vetorB[i];
            } else {
                System.out.println("Atenção: Divisão por zero em B[" + i + "]. Definindo C[" + i + "] como 0.");
                vetorC[i] = 0;
            }
        }

        // Exibindo os valores lado a lado:
        System.out.println("\nResultado da divisão dos vetores A e B:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("A[%d] = %.2f, B[%d] = %.2f, C[%d] = %.2f\n",
                    i, vetorA[i], i, vetorB[i], i, vetorC[i]);
        }

        scan.close();
    }
}