import java.util.Random;
import java.util.Scanner;

class Ejercicio7
{
    public static void main(String[] args) {
        Random random1 = new Random();

        int[][] numeros = new int[4][3];

        int suma = 0;

        int i = 0;
        while (i <= 3) {
            int j = 0;
            while (j <= 2) {
                numeros[i][j] = random1.nextInt(555);
                System.out.print(numeros[i][j] + " ");
                if (i == 1 || i == 3) {
                    suma = suma + numeros[i][j];
                }
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
        System.out.println("suma de filas par: " + suma);
    }
}
