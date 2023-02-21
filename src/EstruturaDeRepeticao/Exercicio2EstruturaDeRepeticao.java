package EstruturaDeRepeticao;

import java.util.Scanner;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Exercicio2EstruturaDeRepeticao {
    public static void main(String[] args) {
        int n;
        int maiorValor = 0;
        int soma = 0;
        double media = 0;

        Scanner scan = new Scanner(System.in);

        for (int contador = 0; contador < 5; contador++){
            System.out.println("digite um numero:");
            n = scan.nextInt();

            if (n > maiorValor){
                maiorValor = n;
            }

            soma += n;
            media = soma/5;


        }
        System.out.println("o maior valor foi: " + maiorValor);
        System.out.println("A media dos valores foram: " + media);
    }
}
