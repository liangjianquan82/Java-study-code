package arraylistclass;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers you want to enter? \n(Enter a number)");
        int numbers = in.nextInt();
        ArrayList<Integer> intlist = new ArrayList<Integer>(numbers);
        try {
            for (int i = 0; i < numbers; i++) {
                System.out.println("Enter the number ("+(i+1)+") :");
                intlist.add(in.nextInt());
            }
        }catch (InputMismatchException e){
            e.printStackTrace();
        }

        System.out.println("Print enter numbers.");
        System.out.println(intlist);

        for(int i = 0; i < numbers; i++)
        {
            int getnumber = intlist.get(i);
            int odd = 0;
            int even = 0;
            if ( getnumber % 2 != 0){
                odd = getnumber*3;
                intlist.set(i,odd);
            }
            else if(getnumber % 2 == 0){
                odd = getnumber*2;
                intlist.set(i,odd);
            }
        }
        System.out.println("Print arraylist after calculation.");
        System.out.println(intlist);
    }
}
