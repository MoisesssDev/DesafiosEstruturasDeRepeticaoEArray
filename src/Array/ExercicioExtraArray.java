package Array;

import java.util.Locale;
import java.util.Scanner;


public class ExercicioExtraArray {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        double[] valores = new double[6];
        int valoresPositivos = 0;
        double somaValoresPositivos = 0;
        double media = 0;

        for(int count = 0; count < valores.length; count++ ){
            System.out.print("Valor: ");
            valores[count] = leitor.nextDouble();

            if (valores[count] > 0){
                valoresPositivos++;

                somaValoresPositivos += valores[count];
                media = somaValoresPositivos / valoresPositivos;

            }
        }

        String valorArredondado = String.format("%.1f", media);

        System.out.println(valoresPositivos + " valores positivos");
        System.out.println(valorArredondado);

    }

}


