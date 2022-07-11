package arraylistexercise;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {2,10,11,22,39,42,45,50,59,61,65,66,73,76,83,97};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.print("\nEnter search number: ");
        int x  = sc.nextInt();
        int pos = -1;
        int lower = 0;
        int upper = a.length - 1;
        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (a[mid] == x) {
                pos = mid;
                break;
            } else if (a[mid] < x) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        if (pos < 0) {
            System.out.println("Not in array");
        } else {
            System.out.println(x + " position " + pos );
        }
    }
}
