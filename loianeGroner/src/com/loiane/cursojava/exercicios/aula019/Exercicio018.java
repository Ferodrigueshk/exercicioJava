package exercicioAula019;

import java.util.Scanner;

public class Exercicio018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] idades = new int[10];

        //Lendo as idade
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite a idade da pessoa" + (i + 1) + ": ");
            idades[i] = scan.nextInt();
        }
        // Inicializando com o primeiro elemento do vetor
        int menorIdade = idades[0];
        int maiorIdade = idades[0];
        int posicaoMenor = 0;
        int posicaoMaior = 0;

        // Verificando menor e maior idade
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                posicaoMenor = i;
            }
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                posicaoMaior = i;
            }
        }


        // Exibindo resultados
        System.out.println("\nMenor idade: " + menorIdade + " (posição " + posicaoMenor + ")");
        System.out.println("Maior idade: " + maiorIdade + " (posição " + posicaoMaior + ")");

        scan.close();
    }
}
