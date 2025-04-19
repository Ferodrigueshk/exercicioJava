package exercicioAula019;

import java.util.Scanner;

public class Exercicio019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] resultado = new double[10];
        //lendo notas e calculando a media
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a 1ª nota do aluno: " + (i + 1) + " : ");
            nota1[i] = scan.nextDouble();

            System.out.println("Digite a 2ª nota do aluno: " + (i + 1) + " : ");
            nota2[i] = scan.nextDouble();

            // Calculando media e armazenando em um vetor
            resultado[i] = (nota1[i] + nota2[i]) / 2;
        }
        System.out.println("\n--- Resultado Final ---");

        // Mostrando a média e a situação do aluno
        for (int i = 0; i < 10; i++) {
            System.out.printf("Aluno %d - Media: %.2f - ", (i + 1), resultado[i]);

            if (resultado[i] >= 7){
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }

        }
        scan.close();
    }
}
