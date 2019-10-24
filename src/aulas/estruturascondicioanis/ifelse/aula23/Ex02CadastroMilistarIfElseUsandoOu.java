package aulas.estruturascondicioanis.ifelse.aula23;

import java.util.Scanner;

public class Ex02CadastroMilistarIfElseUsandoOu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o sexo sendo 'M' para Masculino e 'F' para Feminino e  informe sua idade: ");
        String sexo = entrada.nextLine();
        int idade = entrada.nextInt();

        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
            if (((sexo.equalsIgnoreCase("M")) || (sexo.equalsIgnoreCase("F"))) && idade < 18) {
                System.out.println("Alistamento não Permitido");
            } else if (sexo.equalsIgnoreCase("M") && (idade >= 18)) {
                System.out.println("Alistamento Obrigaorio");
            } else if (sexo.equalsIgnoreCase("F") && idade >= 18) {
                System.out.println("Deseja Alista-se? ");
            }
        } else {
            System.out.println("Cadastro do sexo incorreto");
        }
    }
}
