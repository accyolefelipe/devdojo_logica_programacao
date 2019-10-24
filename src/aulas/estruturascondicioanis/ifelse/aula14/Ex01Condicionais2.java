package aulas.estruturascondicioanis.ifelse.aula14;

import java.util.Scanner;

public class Ex01Condicionais2 {
    public static void main(String[] args) {
        int idade;
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe sua idade");
        idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

    }
}
