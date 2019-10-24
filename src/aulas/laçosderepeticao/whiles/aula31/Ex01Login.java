package aulas.laçosderepeticao.whiles.aula31;

import java.util.Scanner;

public class Ex01Login {
    public static void main(String[] args) {
        final String login = "felipe";
        final String password = "biscoito";

        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Digite seu Login: ");
            String loginDigitado = entrada.nextLine();
            System.out.println("Digite sua Senha: ");
            String passwordDigitado = entrada.nextLine();

            if (login.equals(loginDigitado) && (password.equals(passwordDigitado))) {
                System.out.println("Acesso Permitido");
                break;
            }
            System.out.println("Acesso Negado, Tente Novamente");
        }
    }
}
