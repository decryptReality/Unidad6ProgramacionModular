import java.util.Random;
import java.util.Scanner;

class Ejercicio11
{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        String[] texto1 = new String[6];
        String[] texto2 = new String[6];
        double[] nums1 = new double[6];

        int i = 0;
        while (i <= 5)
        {
            System.out.println("para este alumno:");
            System.out.println("ingrese un nombre");
            texto1[i] = scanner1.next();
            System.out.println("ingrese su nota");
            nums1[i] = scanner2.nextDouble();
            if (0 <= nums1[i] && nums1[i] <= 10)
            {
                if (0 <= nums1[i] && nums1[i] <= 4.99)
                {
                    texto2[i] = "suspenso";
                }
                if (5 <= nums1[i] && nums1[i] <= 6.99)
                {
                    texto2[i] = "bien";
                }
                if (7 <= nums1[i] && nums1[i] <= 8.99)
                {
                    texto2[i] = "notable";
                }
                if (9 <= nums1[i] && nums1[i] <= 10)
                {
                    texto2[i] = "sobresaliente";
                }
            }
            i = i + 1;
        }

        i = 0;
        while (i <= 5)
        {
            System.out.println(texto1[i] + ", nota: " + nums1[i] + ", calificacion: " + texto2[i]);
            i = i + 1;
        }
    }
}
