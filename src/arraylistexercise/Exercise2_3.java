package arraylistexercise;

import java.util.Scanner;


public class Exercise2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter? ");
        int sum = in.nextInt();
        Integer a[] = new Integer[sum];

        for (int i = 0; i < sum; i++) {
            System.out.print("Enter the Number" + (i + 1) + ": ");
            int input = in.nextInt();

            a[i] = input;
            //a[i] = i;
        }
        System.out.println();
        for (int i = 0; i < sum; i++) {
            System.out.print(a[i] + ",");
        }

        System.out.println();
        System.out.println("Cyclic print of existing values:");

        //3-Write a program to accept n integer values in an array
        // (array size defined and inputted by the user).
        // Then start showing/printing the existing values in the following format.
        int n = sum;
        for (int i = 0; i < sum; i++) {
            System.out.print("- Cycle " + (i + 1) + ": ");
            if(i!=0) {
                a = end_to_first(a);
            }
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + ",");
            }
            System.out.println();
        }
        in.close();
    }

    public static Integer[] end_to_first(Integer a[]) {
        Integer b[] = new Integer[a.length];
        b[0] = a[a.length - 1];
        for (int i = 1; i < b.length; i++) {
            b[i] = a[i - 1];
        }
        return b;
    }

}
