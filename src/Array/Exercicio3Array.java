package Array;

import java.util.Random;
/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
*/
public class Exercicio3Array {
    public static void main(String[] args) {
        Random geradorAleatorio = new Random();
        int[] array = new int[20];

        for ( int i = 0; i < array.length; i++){
            int numeroAleatorio = geradorAleatorio.nextInt(100) + 1;
            array[i] = numeroAleatorio;
        }

        System.out.println("Numeros Aleatorios:");
        for (int numero: array) {
            System.out.print( numero +" ");
        }

    }
}
