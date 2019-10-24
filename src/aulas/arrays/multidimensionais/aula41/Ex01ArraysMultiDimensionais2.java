package aulas.arrays.multidimensionais.aula41;

import java.util.Scanner;

public class Ex01ArraysMultiDimensionais2 {
    public static void main(String[] args) {
        int[][] arrayMult1 = new int[3][3];


        Scanner entrada= new Scanner(System.in);

        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                System.out.println("digite o valor da posição: [" + i + "][" + j + "]: ");
                arrayMult1[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                System.out.println("[" + i + "][" + j + "]="+arrayMult1[i][j]);
            }
        }

    }
}
