package aulas.arrays.unidimensional.aula38;

import java.util.Scanner;

public class Ex02ArraysForLenght {
    public static void main(String[] args) {
        int continuar = 1;
        double[] notas = new double[4];

        Scanner entrada = new Scanner(System.in);

        do {
            double somaNotas = 0;
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Digite a " + (i + 1) + "ª nota:");
                notas[i] = entrada.nextDouble();
                somaNotas = somaNotas + notas[i];
            }

            /*for (int i = 0; i < notas.length; i++) {
                System.out.println((i + 1) + "ª nota: " + notas[i]);
            }*/

            double mediaNotas = somaNotas / notas.length;

            if (mediaNotas >= 7) {
                System.out.println("Aprovado | Media: " + mediaNotas);
            } else if (mediaNotas < 7 && mediaNotas >= 5) {
                System.out.println("Recuperação | Media: " + mediaNotas);
            } else {
                System.out.println("Reprovado | Media:" + mediaNotas);
            }
            System.out.println("Deseja fazer a media de um novo aluno? 1- Sim | 2- Não ");
            continuar = entrada.nextInt();
        } while (continuar == 1);
    }
}
