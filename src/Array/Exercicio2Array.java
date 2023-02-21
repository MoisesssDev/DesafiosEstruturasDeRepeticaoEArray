package Array;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Exercicio2Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] caracteres = new String[6];
        int quantidadeConsoantes = 0;

        for (int count = 0; count < caracteres.length; count++){
            System.out.print("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                caracteres[count] = letra;
                quantidadeConsoantes++;
            }
        }

        System.out.print("Consoantes: ");
        for (String caractere : caracteres) {
            if (caractere != null)
                System.out.print(caractere + ", ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(caracteres.length);
    }
}
