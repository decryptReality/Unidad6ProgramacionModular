import java.util.Random;
import java.util.Scanner;

class Ejercicio2
{
    public static void main(String[] args) {
        int[] numeros = new int[10];

        int i = 0;
        while (i <= 9)
        {
            Random random1 = new Random();
            int numero = random1.nextInt(100);
            numeros[i] = numero;
            i = i + 1;
        }

        int mayor = numeros[0];

        i = 0;
        while (i <= 9)
        {
            System.out.print(numeros[i] + " ");
            if (numeros[i] > mayor)
            {
                mayor = numeros[i];
            }
            i = i + 1;
        }

        int repeticionesMayor = 0;

        i = 0;
        while (i <= 9)
        {
            if (mayor == numeros[i])
            {
                repeticionesMayor = repeticionesMayor + 1;
            }
            i = i + 1;
        }
        System.out.println("\nmayor: " + mayor);
        System.out.println("repeticiones: " + repeticionesMayor);
    }
}
