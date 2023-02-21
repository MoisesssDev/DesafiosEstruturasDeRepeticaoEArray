package EstruturaDeRepeticao;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Exercicio3EstruturaDeRepeticao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        int numerosPar = 0;
        int numerosImpar = 0;
        int mostrarNumeros;
        int condicao;


        System.out.print("Digite o numero de intervalo que vc deseja descobrir: ");
        n = scan.nextInt();
        System.out.println("0 - numeros pares");
        System.out.println("1 - numeros impares");
        mostrarNumeros = scan.nextInt();

        switch (mostrarNumeros){
            case 0:
                System.out.println("Numeros Pares:");
                for (int count = 0; count <= n; count++){

                    if (count%2 == 0){
                        System.out.println(count);
                        numerosPar++;
                    }
                }
                System.out.println("Total de Pares: " + numerosPar);

            case 1:
                System.out.println(" ");
                System.out.println("Numeros Impares:");
                for (int count = 0; count <= n; count++){

                    if (count%2 != 0){
                        System.out.println(count);
                        numerosImpar++;
                    }
                }
                System.out.println("Total de Impares: " + numerosImpar);
        }

    }
}
