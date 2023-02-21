package EstruturaDeRepeticao;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/

import java.util.Scanner;

public class Exercicio5EstruturaDeRepeticao {

    public static void main(String[] args) {
        int numeroFatorial;
        int resultadoFatorial = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero que vc deseja descobrir o fatorial: ");
        numeroFatorial = scan.nextInt();

        for (int count = 2; count <= numeroFatorial; count++){

            resultadoFatorial *= count;
        }

        System.out.println(numeroFatorial + "!= " + resultadoFatorial);

    }
}
