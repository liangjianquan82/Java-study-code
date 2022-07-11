package exceptionpractice;

import com.sun.tools.javac.Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice1 {
    public static <c> void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean loop = true;
        int a = 0;
        int b = 0;
        int c = 0;
        boolean loopi = true;
        do {

            System.out.println("Enter an integer 'a':");
            a = sc.nextInt();


            System.out.println("Enter number 'b':");
            b = sc.nextInt();

            try {
                c = a / b;
                loopi = false;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println("exception handled. execution continues.");
                System.out.println("Enter again");
            }

        } while (loopi);
        System.out.println("c = " + c);
    }
}
