package arraylistexercise;

import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter? ");
        int sum = in.nextInt();
        Integer a[] = new Integer[sum];

        for (int i = 0; i < sum; i++) {
            System.out.print("Enter the Number" + (i + 1) + ": ");
            int input = in.nextInt();

            a[i] = input;
        }
        System.out.println();
        for (int i = 0; i < sum; i++) {
            System.out.print(a[i] + ",");
        }

        Integer b[] = negative_to_left(a);
        System.out.println();
        for (int i = 0; i < sum; i++) {
            System.out.print(b[i] + ",");
        }
        in.close();
    }

    public static Integer[] negative_to_left(Integer[] a) {
        Integer b[] = new Integer[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]<0){
                b[count] = a[i];
                count++;
            }
        }
        for(int i = 0; i < a.length; i++)
        {
            if (a[i]>=0){
                b[count] = a[i];
                count++;
            }
        }

        return b;
    }
}
