package arraylistclass;

import java.util.ArrayList;
import java.util.Scanner;
/*
Write a program to create an array of integers (accept the size from the user).
Accept values from the user and print them from the middle towards two ends.
 */
public class Middle_towards_two_ends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> listint = new ArrayList<Integer>();
        boolean flag = true;
        while (flag) {
            System.out.println("Wish to enter Integer?(y or n)");
            String choice = in.next();
            if (choice.equalsIgnoreCase("n")) {
                flag = false;
            } else {
                System.out.println("Enter the Integer: ");
                listint.add(in.nextInt());
            }
        }
//        listint.add(1);
//        listint.add(2);
//        listint.add(3);
//        listint.add(4);
//        listint.add(5);
//        listint.add(6);
//        listint.add(7);

        System.out.println(listint);
        int ss = listint.size();
        int j = 0;
        for (int i = ss / 2; i < ss; i++) {
            //even-偶数
            if (ss % 2 != 1 && i == ss / 2) {
                j = i - 1;
                System.out.println(listint.get(i) + "," + listint.get(j));
            }
            //odd-奇数
            else if (ss % 2 == 1 && i == ss / 2) {
                j = i - 1;
                i = i + 1;
                System.out.println(listint.get(i) + "," + listint.get(j));
            } else {
                j = j - 1;
                System.out.println(listint.get(i) + "," + listint.get(j));
            }
        }
        in.close();
    }
}
