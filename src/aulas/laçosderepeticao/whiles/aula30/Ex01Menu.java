package aulas.laçosderepeticao.whiles.aula30;

import java.util.Scanner;

public class Ex01Menu {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);

        while (opcao != 3) {
            System.out.println("1- Calcular Imposto | 2- Depositar Salario | 3- Sair");
            opcao = entrada.nextInt();
        }
        System.out.println("Programa Encerrado");
    }

}
