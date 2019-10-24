package aulas.estruturascondicioanis.ifelse.aula24;

import java.util.Scanner;

public class Ex01DiasDaSemanaIfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o dia da Semana");
        int dia = entrada.nextInt();

        if (dia == 1) {
            System.out.println("Domingou!!");
        } else if (dia == 2) {
            System.out.println("Vixx Segunda Ainda!!");
        } else if (dia == 3) {
            System.out.println("Terça :(");
        } else if (dia == 4) {
            System.out.println("Quarta!! Dia de Jogo!!");
        } else if (dia == 5) {
            System.out.println("Quinta!! Dia do TBT");
        } else if (dia == 6) {
            System.out.println("Sextou Carai!!");
        } else if (dia == 7) {
            System.out.println("Sabadão");
        } else{
            System.out.println("Dia invalido");
        }


    }
}