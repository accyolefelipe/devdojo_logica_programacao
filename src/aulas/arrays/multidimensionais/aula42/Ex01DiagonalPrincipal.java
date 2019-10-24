package aulas.arrays.multidimensionais.aula42;

public class Ex01DiagonalPrincipal {
    public static void main(String[] args) {
        int[][] arrayMult1 = new int[3][3];
        arrayMult1[0][0] = 50;
        arrayMult1[0][1] = 60;
        arrayMult1[0][2] = 70;
        arrayMult1[1][0] = 81;
        arrayMult1[1][1] = 91;
        arrayMult1[1][2] = 101;
        arrayMult1[2][0] = 12;
        arrayMult1[2][1] = 22;
        arrayMult1[2][2] = 32;

        int resultMultDiagonal = 1;

        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                if (i == j) {
                    resultMultDiagonal = resultMultDiagonal * arrayMult1[i][j];
                }
            }
        }
        System.out.println("resultado da multiplicação das posições na diagonal principal: "
                + resultMultDiagonal);
    }
}
