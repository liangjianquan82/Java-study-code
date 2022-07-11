package arraylistexercise;

import java.util.ArrayList;
import java.util.Scanner;

//1.Write a program to create an array of n integers (selected by user).
// Then, accept another number and try to find and delete its all occurrences.
public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> listint = new ArrayList<Integer>();

        System.out.println("How many numbers do you want to enter?  enter a number: ");
        int sum = in.nextInt();
        Integer a[] = new Integer[sum];

        for (int i = 0; i < sum; i++) {
            System.out.println("Enter the Number" + (i + 1) + ": ");
            int input = in.nextInt();
            listint.add(input);
            a[i] = input;
        }
        System.out.println(listint);
        for (int i = 0; i < sum; i++) {
            System.out.print(a[i] + ",");
        }

        System.out.println("\nEnter a number you want to delete? ");

        int m = in.nextInt();
        Integer[] b = delete_all(a, m);
        for (int i = 0; i < sum; i++) {
            if (b[i] != null)
                System.out.print(b[i] + ",");
        }
    }

    public static Integer[] delete_all(Integer[] a, int m) {
        Integer b[] = new Integer[a.length];
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == m) {
                b[i] = null;
            } else {
                b[i] = a[i];
            }
        }
        return b;
    }
}
