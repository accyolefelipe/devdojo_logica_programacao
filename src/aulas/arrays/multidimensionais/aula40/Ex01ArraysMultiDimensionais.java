package aulas.arrays.multidimensionais.aula40;

public class Ex01ArraysMultiDimensionais {
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

        System.out.println(arrayMult1[0][0]);
        System.out.println(arrayMult1[0][1]);
        System.out.println(arrayMult1[0][2]);
        System.out.println(arrayMult1[1][0]);
        System.out.println(arrayMult1[1][1]);
        System.out.println(arrayMult1[1][2]);
        System.out.println(arrayMult1[2][0]);
        System.out.println(arrayMult1[2][1]);
        System.out.println(arrayMult1[2][2]);

    }
}
