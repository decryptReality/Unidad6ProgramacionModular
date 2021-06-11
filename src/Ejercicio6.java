import java.util.Random;
import java.util.Scanner;

class Ejercicio6
{
    public static void main(String[] args) {
        int[][] numeros = new int[][]
                {
                        {5, 6, 13},
                        {14, 2, 4},
                        {21, 7, 6}
                };

        int i = 0;
        while (i <= 2)
        {
            int j = 0;
            while (j <= 2)
            {
                numeros[i][j] = 2 * numeros[i][j];
                System.out.print(numeros[i][j] + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
