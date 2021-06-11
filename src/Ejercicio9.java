import java.util.Random;
import java.util.Scanner;

class Ejercicio9
{
    public static void main(String[] args) {
        System.out.println("SUMA DE MATRICES");
        int[][] nums1 =
                {
                        {12,15,19,18,27,29},
                        {54,35,84,91,72,65},
                };
        int[][] nums2 =
                {
                        {21,51,91,81,72,92},
                        {45,53,48,19,27,56},
                };
        int[][] nums3 = new int[2][6];

        int i = 0;
        while (i <= 1)
        {
            int j = 0;
            while (j <= 5)
            {
                System.out.print(nums1[i][j] + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }

        System.out.println("+");

        i = 0;
        while (i <= 1)
        {
            int j = 0;
            while (j <= 5)
            {
                System.out.print(nums2[i][j] + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }

        System.out.println("=");

        i = 0;
        while (i <= 1)
        {
            int j = 0;
            while (j <= 5)
            {
                nums3[i][j] = nums1[i][j] + nums2[i][j];
                System.out.print(nums3[i][j] + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
