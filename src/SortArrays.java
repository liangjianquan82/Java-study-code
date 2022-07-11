import java.util.Scanner;

public class SortArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j;
        String a[] = new String[5];
        for (i = 0; i < 5; i++) {
            System.out.print("Enter string");
            a[i] = in.next();
        }

        for (j = 0; j < 5; j++) {
            for (i = 0; i < 4; i++) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    String temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                }
            }

        }
        for (i=0;i<5;i++){
            System.out.print(a[i]);
        }
        in.close();
    }
}
