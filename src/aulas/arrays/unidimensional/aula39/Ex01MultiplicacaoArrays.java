package aulas.arrays.unidimensional.aula39;

import java.util.Scanner;

public class Ex01MultiplicacaoArrays {
    public static void main(String[] args) {
        int[] array1 = new int[4];
        int[] array2 = new int[4];
        int[] array3 = new int[4];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Array 1 | Posicão " + i + " :");
            array1[i] = entrada.nextInt();
        }


        for (int i = 0; i < array2.length; i++) {
            System.out.println("Array 2 | Posicão " + i + " :");
            array2[i] = entrada.nextInt();
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.println("Array 3 | Posição" + i + " : " + (array3[i] = array1[i] * array2[i]));

        }
        /*for (int i = 0; i < array1.length; i++) {
            System.out.println("indice:  " + i + " = " + array1[i] +
                    " | " + (i + 1) + "ª posicão = " + array1[i]);
        }*/
    }
}
