package Avaliação;

import java.util.Scanner;

public class exercicio {
    Scanner sc = new Scanner(System.in);

    public void ex1() {
        System.out.println("Infome o valor 1:");
        double valor1 = sc.nextDouble();
        System.out.println("Infome o valor 2:");
        double valor2 = sc.nextDouble();
        System.out.println("1 -> Adição, 2 -> Subtração, 3 -> Mulitiplicação, 4 -> Divisão");
        double operacao = sc.nextDouble();
        if (operacao == 1) {
           System.out.println("Resultado da Soma é = "+ (valor1 + valor2) );             
        } else if (operacao == 2) {
            System.out.println("Resultado da Subtração é = " +(valor1 - valor2));
        }
        else if (operacao == 3) {
            System.out.println("Resultado da Multiplicação é = " +(valor1 * valor2));
        }
        else if (operacao == 4) {
            System.out.println("Resultado da Divisão é = " +(valor1 / valor2));
        }
        else {
            System.out.println("Operação Inválida!!");
        }
    }

    public void ex2() {
        
    }

    public void ex3() {
        System.out.println("Quantos quilos de Morangos?");
        double morangokg = sc.nextDouble();
        System.out.println("Quantos quilos de Maças?");
        double macakg = sc.nextDouble();
        System.out.println("Quantos quilos de Bananas?");
        double bananakg = sc.nextDouble();

        double valorFinal = (morangokg*2.50) + (macakg*1.80) + (bananakg*1.30);

        if ( (morangokg+macakg+bananakg) > 8 || valorFinal > 25) {
         System.out.println("o valor a ser pago com desconto é: R$" + (valorFinal - (valorFinal * 0.1)));
        } else {
            System.out.println("o valor a ser pago é: R$"+valorFinal);
        }
    }
    public void ex4() {
        System.out.println("Informe seu nome:");
        String nome = sc.nextLine();
        
    }
}
