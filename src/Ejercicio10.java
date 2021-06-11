import java.util.Random;
import java.util.Scanner;

class Ejercicio10
{
    public static void main(String[] args) {
        System.out.println("la transpuesta de");
        int[][] nums1 =
                {
                        {19,18,27,29},
                        {54,35,72,65},
                        {21,51,91,81}
                };
        int[][] nums2 = new int[4][3];

        int i = 0;
        while (i <= 2)
        {
            int j = 0;
            while (j <= 3)
            {
                System.out.print(nums1[i][j] + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
        System.out.println("es");
        int j = 0;
        while (j <= 3)
        {
            i = 0;
            while (i <= 2)
            {
                nums2[j][i] = nums1[i][j];
                System.out.print(nums2[j][i] + " ");
                i = i + 1;
            }
            System.out.println();
            j = j + 1;
        }
    }
}
