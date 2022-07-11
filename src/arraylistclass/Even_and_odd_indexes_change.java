package arraylistclass;

import java.util.ArrayList;
import java.util.Scanner;

public class Even_and_odd_indexes_change {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> listint = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the Number"+(i+1)+": ");
            int input = in.nextInt();
            listint.add(input);
        }
//        listint.add(1);
//        listint.add(2);
//        listint.add(3);
//        listint.add(4);
//        listint.add(5);
//        listint.add(6);
//        listint.add(7);
//        listint.add(8);
//        listint.add(9);
//        listint.add(10);

        System.out.println(listint);
        for(int i = 0 ;i<listint.size();i++){
           if(i%2==1){
               int temp  = listint.get(i-1);
               listint.set((i-1),listint.get(i));
               listint.set(i,temp);

           }
        }
        System.out.println(listint);
    }
}
