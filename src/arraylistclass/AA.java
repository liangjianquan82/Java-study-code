package arraylistclass;

import java.util.ArrayList;
import java.util.Scanner;


public class AA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> listint = new ArrayList<Integer>();

        System.out.println("Enter the arraylonger: ");
        int sum = in.nextInt();
        int a[] = new int[sum];
        for (int i = 0; i < sum; i++) {
            System.out.println("Enter the Number" + (i + 1) + ": ");
            int input = in.nextInt();
            listint.add(input);
            a[i] = input;
        }
        //System.out.println(listint);
        for (int i = 0; i < sum; i++) {
            System.out.print(a[i] + ",");
        }

        /*
Write a program to create an array of 10 integers.
Accept values from the user.
Calculate the sum of indexes in each iteration and
check whether the sum is equal to the value in each block.
 */
//        for (int i = 0; i < sum; i++) {
//            System.out.println("Enter the Number" + (i + 1) + ": ");
//            int input = in.nextInt();
//            listint.add(input);
//            sum = i + sum;
//             System.out.println("now index sum = " + sum);
//            if (sum == input) {
//                System.out.print("Value find!   ");
//            }
//        }


        //Write a program to create an array of n integers (selected by user).
        // Accept values from the user and check if the array is palindrome or not.
//        System.out.println(listint);
//        String s = "";
//        for (int i = 0; i < listint.size(); i++) {
//            s = s + "" + listint.get(i);
//        }
//        palindromeString(s);

        // Write a program to create an array of n integers (selected by user).
        // Then, try to delete an element based on the index number entered by user.
//       1.==================
//        System.out.println("Enter the delete index: ");
//        int deindex = in.nextInt();
//        for(int i = 0; i < listint.size(); i++)
//        {
//            if(listint.get(i) == delint){
//                listint.remove(i);
//            }
//        }
//        listint.remove(deindex);
//        System.out.println(listint);

        //2======================
//        Scanner h=new Scanner(System.in);
//
//
//        for(i=0;i<n;i++)System.out.print(a[i] + ",");
//        System.out.println("\nwhich block you want to delete? ");
//        int m=h.nextInt();
//        for(m--;m<n-1;m++) a[m]=a[m+1];
//        for(i=0;i<n-1;i++)System.out.print(a[i] + ",");


        //Write a program to create an array of n integers (selected by user).
        // Then, accept another number and try to find it in array and delete its first occurrence.
        //1===============
//        System.out.println("Enter the delete number: ");
//        int deindex = in.nextInt();
//        for (int i = 0; i < listint.size(); i++) {
//            if (listint.get(i) == deindex) {
//                listint.remove(i);
//                break;
//            }
//        }
//        System.out.println(listint);

        //2=========

        System.out.println("\nwhich number you want to delete? ");
        int n = 0;
        int m = in.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == m) {
                n = i;
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (i !=n)
                System.out.print(a[i] + ",");
        }


        in.close();
    }

    public static boolean PalindromeNumberorNot(int a) {
        boolean p = true;
        String s = String.valueOf(a);
        char[] c = s.toCharArray();
        int lenA = c.length;
        int mid = lenA / 2;
        int front;
        int back;
        if (lenA % 2 == 0) {   //Even judgment
            front = mid - 1;
            back = mid;
        } else {
            front = mid - 1;
            back = mid + 1;
        }
        if (s.equals("") || s.equals(null)) {
            p = false;
        }
        while (front >= 0 && back < lenA) {
            if (c[front--] != c[back++])
                p = false;
        }
        return p;
    }

    public static void palindromeString(String a) {
        int j = a.length();
        int i, flag = 0;
        for (i = 0, j--; j > i; i++, j--) {
            if (a.charAt(i) != a.charAt(j)) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
