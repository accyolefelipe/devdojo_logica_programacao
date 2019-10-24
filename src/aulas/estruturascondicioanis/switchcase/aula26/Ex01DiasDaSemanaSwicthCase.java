package aulas.estruturascondicioanis.switchcase.aula26;

import java.util.Scanner;

public class Ex01DiasDaSemanaSwicthCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o dia da semana: ");
        int dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingou!!");
                break;
            case 2:
                System.out.println("Vixx Segunda Ainda!!");
                break;
            case 3:
                System.out.println("Terça :(");
                break;
            case 4:
                System.out.println("Quarta!! Dia de Jogo!!");
                break;
            case 5:
                System.out.println("Quinta!! Dia do TBT");
                break;
            case 6:
                System.out.println("Sextou Carai!!");
                break;
            case 7:
                System.out.println("Sabadão");
                break;
            default:
                System.out.println("escolha invalida");
                break;
        }
        System.out.println("Fim do Programa!!!");
    }

}

