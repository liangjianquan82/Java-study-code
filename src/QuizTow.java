import java.util.Scanner;

public class QuizTow {
    public static void main(String[] args) {
        int a[] = new int[30];
        int i;
        Scanner scanner = new Scanner(System.in);
//       1-Write a program to create an array of 30 blocks.
//        Accept first 10 numbers from the user.
//        Fill the second ten blocks with calculating factorial of first ten elements.
//        Fill the third ten blocks with the square of first ten elements.
        System.out.println("Enter 10 Number:");
        for (i = 0; i < 10; i++) {
            System.out.println("Enter number" + (i + 1) + ":");
            a[i] = scanner.nextInt();
        }
        factorial(a);
        square(a);
        for (i = 0; i < 30; i++) {
            System.out.print(a[i] + "|");
        }
        System.out.println();
//       2-A prime number whose reversal is also a prime is called Emirp.
//        example: 101, 131, 1933 are Emirps.
//        Write a program that outputs the first 100 Emirps starting from number 100.
//        Your program must contain a method to find the prime number and another method for reversing a number.
        int nbe = 0, nb;
        int resverNb, primeNb;
        boolean isPrimeNb = true;
        for (nb = 100; nbe <= 100; nb++) {
            isPrimeNb = Prime(nb);
            if (isPrimeNb) {
                resverNb = Resver(nb);
                isPrimeNb = Prime(resverNb);
                if (isPrimeNb) {
                    System.out.println(nb + " is an EMIRP.");
                    nbe++;
                }

            }

        }

    }

    public static void factorial(int a[]) {
        int k = 1;
        for (int i = 0; i < 10; i++) {
            k = k * a[i];
            a[i + 10] = k;
        }
    }

    public static void square(int a[]) {
        for (int i = 0; i < 10; i++) {
            a[i + 20] = a[i] * a[i];
        }
    }

    public static int Resver(int a) {
        int n = 0;
        while (a > 0) {
            n = n * 10 + a % 10;
            a = a / 10;
        }
        return n;
    }

    public static boolean Prime(int a) {
        boolean isprime = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }
}
