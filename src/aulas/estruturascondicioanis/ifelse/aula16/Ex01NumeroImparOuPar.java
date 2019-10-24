package aulas.estruturascondicioanis.ifelse.aula16;

import java.util.Scanner;

public class Ex01NumeroImparOuPar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um Numero: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero Par");
        } else {
            System.out.println("Numero Impar");
        }
    }
}
