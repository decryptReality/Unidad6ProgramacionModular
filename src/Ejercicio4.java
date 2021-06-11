import java.util.Random;
import java.util.Scanner;

class Ejercicio4
{
    public static void main(String[] args) {
        Random random1 = new Random();

        int[] numeros = new int[1000000];

        int i = 0;
        while (i <= 9)
        {
            numeros[i] = random1.nextInt(129);
            i = i + 1;
        }

        System.out.println("valores generados:");
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
        System.out.println("\nnumero mayor: " + mayor);

        System.out.println("diferencias: mayor - numeros[i]");
        i = 0;
        while (i <= 9)
        {
            int diferencia = mayor - numeros[i];
            System.out.println(mayor + " - " + numeros[i] + " = " + diferencia);
            i = i + 1;
        }
    }
}

