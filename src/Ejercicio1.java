
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int[] numeros = new int[5];
        int i = 0;
        while (i <= 4)
        {
            System.out.println(">>> asigne un valor int a numeros[" + i +"]");
            numeros[i] = scanner1.nextInt();
            System.out.println("contenido en numeros[" + i + "]: " + numeros[i] + " <<<");
            i = i + 1;
        }
    }
}
