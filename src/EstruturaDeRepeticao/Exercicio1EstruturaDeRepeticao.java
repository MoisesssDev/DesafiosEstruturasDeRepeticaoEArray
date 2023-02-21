package EstruturaDeRepeticao;

import java.util.Scanner;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Exercicio1EstruturaDeRepeticao {
    public static void main(String[] args) {
        int nota;

        Scanner scan = new Scanner(System.in);

        System.out.print("Nota: ");
        nota = scan.nextInt();


        while (nota < 0 || nota > 10){
            System.out.println("Selecione um número entre 0 e 10!!!");
            System.out.print("Nota: ");
            nota = scan.nextInt();
        }
    }
}