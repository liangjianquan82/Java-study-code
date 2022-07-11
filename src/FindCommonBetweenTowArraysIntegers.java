import java.util.Scanner;

public class FindCommonBetweenTowArraysIntegers {
    public static void main(String[] args) {

        int[] a = new int[5];
        int[] b = new int[5];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter arrays (a)  number " + (i + 1) + ":");
            a[i] = in.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter arrays (b)  number " + (i + 1) + ":");
            b[i] = in.nextInt();
        }

        int[] commonArrays = commonElements(a, b);

        System.out.println();
        System.out.println("Common Elements :");
        for (int i = 0; i < commonArrays.length; i++) {
            if(commonArrays[i]!=0)
            System.out.print(commonArrays[i] + " ");
        }

        in.close();

    }

    /**
     * Find common elements of two arrays
     * @param a arrays
     * @param b arrays
     * @return commonElements arrays
     */
    public static int[] commonElements(int[] a, int[] b) {
        int[] arrays = new int[a.length];
        int k = 0;
        int s,c;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    arrays[k] = a[i];
                    k++;
                }
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if (arrays[i] == arrays[j] && i != j) {
                    arrays[j] = 0;
                }
            }
        }

        return arrays;
    }
}
