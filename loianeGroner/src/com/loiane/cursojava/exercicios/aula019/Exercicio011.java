package exercicioAula019;


import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int contadorPares = 0;

        //Preenchendo o vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor de VetorA[" + i + "] :");
            vetorA[i] = scan.nextInt();
        }

        // Verificando se é par e contando
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                contadorPares++;
            }
        }

        //Exibindo resultados
        System.out.println("\nQuantidade de numeros pares no vetor: " + contadorPares);
        scan.close();
    }
}