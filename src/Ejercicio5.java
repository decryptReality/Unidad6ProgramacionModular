import java.util.Random;
import java.util.Scanner;

class Ejercicio5
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        int[] numeros = new int[100];

        boolean esMenos50 = false;
        double promedio = 0;
        int suma = 0;

        int i = 0;
        while (!esMenos50)
        {
            int numero = scanner1.nextInt();
            if (numero == -50 || i == 99)
            {
                esMenos50 = true;
                numeros[i] = -50;
                int j = 0;
                while (j <= i - 1)
                {
                    suma = suma + numeros[j];
                    j = j + 1;
                }
                promedio = suma / (i * 1.0);
            }
            else
            {
                numeros[i] = numero;
            }
            i = i + 1;
        }

        System.out.println("promedio: " + promedio);
    }
}
