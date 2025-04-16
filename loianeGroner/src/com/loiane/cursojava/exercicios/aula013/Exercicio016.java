package com.loiane.cursojava.exercicios.aula013;

import java.util.Scanner;

public class Exercicio016 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho da área em M²: ");
        double area = scan.nextDouble();

        // Sabemos que 1 litro de tinta cobre 6 m²
        double qtdTinta = area / 6;
        // Adicione 10% de folga e como devido arredondamento solicitado pelo cliente
        double qtdSeguraTinta = Math.ceil(qtdTinta * 1.1);

        // Cada lata tem 18 litros.
        double qtdLatas = Math.ceil(qtdSeguraTinta / 18);
        double precoLatas = qtdLatas * 80;

        // Cada lata tem 3,6 litros.
        double qtdGaloes = Math.ceil(qtdSeguraTinta / 3.6);
        double precoGaloes = qtdGaloes * 25.00;

        // Calculando a Combinação Ideal (Latas + Galões)
        double qtdLatasMistas = (int) (qtdSeguraTinta / 18);
        double litrosRestantes = qtdSeguraTinta % 18;

        // Calcule quantos galões são necessários para os litros restantes
        double qtdGaloesMistos = Math.ceil(litrosRestantes / 3.6);
        double precoMisto = (qtdLatasMistas * 80) + (qtdGaloesMistos * 25);

        // Exibir resultados
        System.out.printf("1. Apenas latas: %d latas = R$ %.2f%n", (int) qtdLatas, precoLatas);
        System.out.printf("2. Apenas galões: %d galões = R$ %.2f%n", (int) qtdGaloes, precoGaloes);
        System.out.printf("3. Combinação mista: %d lata(s) + %d galão(ões) = R$ %.2f%n", (int) qtdLatasMistas,
                (int) qtdGaloesMistos, precoMisto);

        // Mostrar a opção mais barata
        double menorPreco = Math.min(Math.min(precoLatas, precoGaloes), precoMisto);
        System.out.printf("%n→ Melhor opção: R$ %.2f%n", menorPreco);

        scan.close();
    }
}
