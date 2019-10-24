package aulas.variaveis.aula10;

public class Ex01CalculaSalario {
    public static void main(String[] args) {
        float salario = 2500.00f;
        float porcentagem = 30;
        float porcentagemDoSalario = salario * (porcentagem / 100);

        System.out.println(porcentagemDoSalario);
    }
}
