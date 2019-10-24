package aulas.laçosderepeticao.whiles.aula32;

import java.util.Scanner;

public class Ex01DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int continuar = 1;
        do {
            System.out.println("Player 1: Digite um numero entre 0 e 10");
            int primeiroNum = entrada.nextInt();
            System.out.println("Player 2: Digite um numero entre 0 e 10");
            int segundoNum = entrada.nextInt();
            System.out.println("Deu Match??? " + (primeiroNum == segundoNum));
            System.out.println("------------------------------------------");
            System.out.println("Deseja Continuar? 1- Sim | 2- Não ");
            continuar = entrada.nextInt();
        } while (continuar == 1);
    }
}
