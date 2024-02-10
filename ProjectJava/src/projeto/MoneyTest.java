package projeto;

import java.util.Scanner;

public class MoneyTest {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        double salario = enter.nextDouble();

        System.out.print("Dias trabalhados no mês: ");
        double diasDeTrabalho = enter.nextDouble();

        if (diasDeTrabalho == 30) {
            System.out.println("Parabéns, seu salário é: " + salario);
        } else if (diasDeTrabalho > 0 && diasDeTrabalho < 30) {
            // Adicione a lógica desejada para calcular o salário com base nos dias trabalhados
            double salarioProporcional = salario * (diasDeTrabalho / 30);
            System.out.println("Seu salário proporcional é: " + salarioProporcional);
        } else {
            System.out.println("Número de dias trabalhados inválido. Informe um valor entre 1 e 30.");
        }

        enter.close();
    }
}