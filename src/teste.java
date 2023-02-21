public class teste {
    public static void main(String[] args) {
        int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
//        System.out.println(num);

        int[][] numeros = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};
        System.out.print(numeros[2][2]);
    }
}
