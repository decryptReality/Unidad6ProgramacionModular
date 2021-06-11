import java.util.Random;
import java.util.Scanner;


class Ejercicio3
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int[] numeros = new int[8];

        int i = 0;
        while (i <= 7)
        {
            System.out.println(">>> numeros[" + i +"]");
            numeros[i] = scanner1.nextInt();
            System.out.println("numeros[" + i + "]: " + numeros[i] + " <<<");
            i = i + 1;
        }

        System.out.println("ingrese un numero para verificar su existencia");
        int buscar = scanner1.nextInt();

        i = 0;
        boolean existe = false;
        while (!existe && i <= 7)
        {
            if (buscar == numeros[i])
            {
                existe = true;
            }
            i = i + 1;
        }
        if (existe)
        {
            System.out.println("VERDADERO");
        }
        else
        {
            System.out.println("FALSO");
        }
    }
}
