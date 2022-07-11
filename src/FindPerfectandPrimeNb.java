import java.util.Scanner;

public class FindPerfectandPrimeNb {
    public static void main(String[] args) {
        int a[] = new int[20];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number " + (i + 1) + ":");
            a[i] = in.nextInt();
        }
        System.out.print("The arrays: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.print("The Prime Number: ");

        for (int i = 0; i < a.length; i++) {
            if (isPrimeOrNot(a[i]) != 0 && a[i]>1 ) {
                System.out.print(" " + a[i]);
            }
        }
        System.out.println();
        System.out.print("The Perfect Number: ");
        for (int i = 0; i < a.length; i++) {
            if (isPerfectOrNot(a[i]) == a[i] && a[i] != 0) {
                System.out.print(" " + a[i]);
            }
        }
        in.close();
    }

    /**
     * Judging prime numbers
     * @param num
     * @return 0 not prime
     */
    public static int isPrimeOrNot(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                num = 0;
            }
        }
        return num;
    }

    /**
     * Judging Perfect numbers
     * @param num
     * @return The returned number after the perfect number judgment
     */
    public static int isPerfectOrNot(int num) {
        int sum = 0;
        //a positive integer that is equal to the sum of its positive divisors,
        // excluding the number itself
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
