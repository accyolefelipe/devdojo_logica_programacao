package aulas.laçosderepeticao.whiles.aula29;

import java.util.Scanner;

public class Ex01ImprimindoImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe um numero: ");
        int numero = entrada.nextInt();
        int contador = 0;

        while (contador <= numero) {
            if (contador % 2 != 0) {
                System.out.println("contador: " + contador);
            }
            contador++;
        }

    }
}
