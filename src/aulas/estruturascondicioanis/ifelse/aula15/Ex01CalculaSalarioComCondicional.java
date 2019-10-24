package aulas.estruturascondicioanis.ifelse.aula15;

import java.util.Scanner;

public class Ex01CalculaSalarioComCondicional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe seu salario: ");
        double salario = entrada.nextDouble();
        System.out.println(salario);

        if (salario > 4500) {
            System.out.println("30% = " + salario * 0.3);
        } else {
            System.out.println("15% = " + salario * 0.15);
        }
    }
}
