package EstruturaDeRepeticao;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Exercicio4EstruturaDeRepeticao {
    public static void main(String[] args) {
        int numeroTabuada;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero que vc deseja ver a tabuada: ");
        numeroTabuada = scan.nextInt();

        for (int count = 1; count <= 10; count++){
            System.out.println(numeroTabuada + " x " + count + " = " + (numeroTabuada*count));
        }
    }
}
