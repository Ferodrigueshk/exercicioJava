package exercicioAula019;

import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        //Preenchendo o vetor A
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor de vetorA[ " + i + "]: ");
            vetorA[i] = scan.nextInt();
        }
        //Preenchendo o vetorB (resto da divisão por 2)
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] % 2;
        }
// exibindo os vetores A e B
        System.out.println("\nResultado do calculo vetorA[i] %2: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vetorA[" + i + "] = " + vetorA[i] +
                    " | vetorB[" + i + "] = " + vetorB[i]);
        }

        scan.close();


    }
}
