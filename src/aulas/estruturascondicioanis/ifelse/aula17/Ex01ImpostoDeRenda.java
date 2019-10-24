package aulas.estruturascondicioanis.ifelse.aula17;

import java.util.Scanner;

public class Ex01ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe seu salario: ");
        double salario = entrada.nextDouble();

        if (salario <= 1903.98) {
            System.out.println("ISENTO");
        } else if (salario >= 1903.99 && salario <= 2826.55) {
            System.out.println("7,5% " + salario * 0.075);
        } else if (salario >= 2826.56 && salario <= 3751.05) {
            System.out.println("15% " + salario * 0.15);
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("22,5% " + salario * 0.225);
        } else {
            System.out.println("27,5% " + salario * 0.275);
        }
    }
}
