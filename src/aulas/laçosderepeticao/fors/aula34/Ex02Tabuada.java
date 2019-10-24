package aulas.laçosderepeticao.fors.aula34;

import java.util.Scanner;

public class Ex02Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 1;

        do {
            System.out.println("Digite o numero a ser Multiplicado: ");
            int num = entrada.nextInt();

            for (int i = 1; i <= 10; i++) {
                int resultado = num * i;
                System.out.println("Tabuada do " + num + " x " + i + " = " + resultado);
            }
            System.out.println("----------------------");
            System.out.println("Deseja continuar? 1 - Para Sim | 2 - Não");
            opcao = entrada.nextInt();

        } while (opcao == 1);
        System.out.println("Fim dos Calculos, Ate a Proxima!");
    }
}
