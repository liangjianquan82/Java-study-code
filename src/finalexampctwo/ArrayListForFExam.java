package finalexampctwo;

import arraylistclass.S;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListForFExam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> Original = new ArrayList<String>();
        System.out.println("Enter the value: ");
        Original.add(in.next());
        boolean flag = true;
        while (flag) {
            System.out.println("Continue?(y or n)");
            String choice = in.next();
            if (choice.equalsIgnoreCase("n")) flag = false;
            else {
                System.out.println("Enter the value: ");
                Original.add(in.next());
            }
        }
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        ArrayList<String> strlist = new ArrayList<String>();
        //NumberFormatException: String a=”hello”   int num=Integer.parseInt(a)
        for (int i = 0; i < Original.size(); i++) {
            int num = 0;
            try {
                num =Integer.parseInt(Original.get(i));
                intlist.add(num);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                strlist.add(Original.get(i));
            }
        }
        System.out.println("Original array list:" + Original);
        System.out.println("Created Array list for strings:" + strlist);
        System.out.println("Created Array list for integers:" + intlist);
    }
}
