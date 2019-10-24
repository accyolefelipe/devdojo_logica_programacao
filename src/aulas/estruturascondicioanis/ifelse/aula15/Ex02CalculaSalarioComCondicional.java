package aulas.estruturascondicioanis.ifelse.aula15;

import java.util.Scanner;

public class Ex02CalculaSalarioComCondicional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe seu salario: ");
        double salario = entrada.nextDouble();
        double resuldado = 0;
        String porcentagem = "";

        if(salario > 4500){
            resuldado = salario * 0.3;
            porcentagem = "30%";
        }else{
            resuldado = salario * 0.15;
            porcentagem = "15%";
        }
        System.out.println("o valor do bonus de "+ porcentagem + " do salario é de: R$" + resuldado);

    }
}
