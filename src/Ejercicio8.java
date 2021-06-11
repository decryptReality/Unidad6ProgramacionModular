import java.util.Random;
import java.util.Scanner;

class Ejercicio8
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        String[] texto1 = new String[5];
        String[] texto2 = new String[5];

        System.out.println("ingrese 5 palabras");
        int i = 0;
        while (i <= 4)
        {
            texto1[i] = scanner1.next();
            i = i + 1;
        }
        System.out.println("ingrese 5 palabras, de nuevo");
        i = 0;
        while (i <= 4)
        {
            texto2[i] = scanner2.next();
            i = i + 1;
        }

        i = 0;
        while (i <= 4)
        {
            int long1 = texto1[i].length();
            int long2 = texto2[i].length();
            System.out.println("> text1[" + i + "]: " + texto1[i]);
            System.out.println(" >> longitud: " + texto1[i].length());
            System.out.println("> text2[" + i + "]: " + texto2[i]);
            System.out.println(" >> longitud: " + texto2[i].length());
            if (long1 == long2)
            {
                System.out.println("longitud de palabras es IGUAL");
            }
            System.out.println();
            i = i + 1;
        }
    }
}
