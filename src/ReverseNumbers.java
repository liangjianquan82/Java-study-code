import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {

        int a[] = new int[2];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number " + (i + 1) + ":");
            a[i] = in.nextInt();
        }
        System.out.println();
        System.out.print("The arrays: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();

        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            char[] ch = String.valueOf(a[i]).toCharArray();
            if (a[i] > 0) {
                //b[i] = Integer.valueOf(RNumbers(ch));
                b[i] = Resver(a[i]);
            } else {
//                String str = RNumbers(ch);
//                str = "-" + str.substring(0, str.length() - 1);
//                b[i] = Integer.valueOf(str);
                b[i] = -1*Resver(Math.abs(a[i]));
            }
        }

        System.out.print("The reverse arrays: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }


    }

    public static String RNumbers(char[] a) {
        String str = "";
        for (int i = a.length - 1; i >= 0; i--) {
            str += a[i];
        }
        return str;
    }

    public static int Resver(int a) {
        int n = 0;
        while (a > 0) {
            n = n * 10 + a % 10;
            a = a / 10;
        }
        return n;
    }
}
