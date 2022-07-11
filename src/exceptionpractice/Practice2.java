package exceptionpractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ten character:");
        String [] str= new String[10];

        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter character " + (i + 1) + ":");
            str[i] = sc.next();

        }
        boolean loopi = true;
        int i = 0;
        do {

                for (i = 0; i < str.length; i++){
                    try {
                    System.out.println(Integer.parseInt(str[i]));
                    }catch (NumberFormatException e){
                        System.out.println(e.getMessage());
                        //System.out.println("\nException handled. Number Format Exception.Execution continues.");
                        //System.out.println(str[i]);
                        //i=i+1;
                    }
                }
                loopi = false;

        }while (loopi);

    }
}
