package aulas.estruturascondicioanis.switchcase.aula27;

import java.util.Scanner;

public class Ex01TipoDeContaSwitchCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" 1- Para Conta Poupança | 2- Para Conta Corrente | 3- Para Conta Investimento");
        int conta = entrada.nextInt();

        switch (conta) {
            case 1:
                System.out.println("Conta Poupança - 0.05%");
                break;
            case 2:
                System.out.println("Conta Corrente - 0.02%");
                break;
            case 3:
                System.out.println("Conta Investimento - 0.1%");
                break;
            default:
                System.out.println("opção invalida");
        }

    }
}
