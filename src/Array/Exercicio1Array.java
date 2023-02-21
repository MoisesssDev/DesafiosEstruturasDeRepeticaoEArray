package Array;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Exercicio1Array {
    public static void main(String[] args) {
        int[] vetor = {3, 7, -2, 1, -8, 5};


        for (int count = (vetor.length - 1); count >= 0; count--){

            System.out.println(vetor[count]);


        }

    }
}
