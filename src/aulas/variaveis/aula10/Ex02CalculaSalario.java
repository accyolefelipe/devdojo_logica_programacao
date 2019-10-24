package aulas.variaveis.aula10;

import java.util.Scanner;

public class Ex02CalculaSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;
        double porcentagem;

        System.out.println("informe o salario atual: ");
        salario =  entrada.nextDouble();
        System.out.println("informe a % de bonus a somar no salario: ");
        porcentagem = entrada.nextDouble();

        double novosalario = salario + salario * (porcentagem / 100);
        double bonus = salario * (porcentagem /100);

        System.out.println("salario atual R$ " + salario);
        System.out.println("bonus recebido R$ "+ bonus);
        System.out.println("novo salario R$ " + novosalario);
    }


}
