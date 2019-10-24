package aulas.estruturascondicioanis.ifelse.aula22;

import java.util.Scanner;

public class ExValidacaoUsuarioUsandoOu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o login a ser cadastrado: ");
        String login = entrada.nextLine();

        if (login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador") || login.equals("")) {
            System.out.println("USUARIO INVALIDO!!!!");
        } else {
            System.out.println("CADASTRADO REALIZADO COM SUCESSO!!!!");
        }
    }
}
