package arraylistexercise;

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many String do you want to enter? ");
        int sum = in.nextInt();
        String a[] = new String[sum];
        String input = null;
        for (int i = 0; i < sum; i++) {
            System.out.print("Enter the String #" + (i + 1) + ": ");
            input = in.next();
            a[i] = input;
        }
        System.out.println();
        for (int i = 0; i < sum; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        String b[] = delete_all_repeated(a);
        for (int i = 0; i < b.length; i++) {
            if (b[i].toString()!="")
                System.out.print(b[i] + ",");
        }

        in.close();
    }
//1-Delete all repeated occurrences in a string array.
// This means after program execution,
// the array would include totally unique strings/words.
    public static String[] delete_all_repeated(String[] a) {
        String b[] = a;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i].equals(b[j]) && i != j) {
                    b[j] = "";
                }
            }
        }
        return b;
    }

}
