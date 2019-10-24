package aulas.estruturascondicioanis.ifelse.aula18;

import java.util.Scanner;

public class Ex01IfElseTorneioNatacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("informe sua idade: ");
        int idade = entrada.nextInt();

        if (idade <= 10) {
            System.out.println(nome + " Participará da Categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " Participará da Categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " Participará da Categoria Pre-Adulto");
        } else {
            System.out.println(nome + " Participará da Categoria Adulto");
        }

    }
}
