package passwordcheck;

import java.awt.*;
import java.util.Scanner;

public class EnterUsernameAndPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        String username = null;
        String password = null;
        System.out.println("Enter the user name:");
        username = sc.nextLine();
        while (loop) {



            try {
                System.out.println("Enter the password:");
                password = sc.nextLine();
                throw new PassCheck(password, username);
            } catch (PassCheck e) {

                if(e.toString()!=null) {
                    System.out.println(e);
                }else {
                    loop = false;
                }

            }

        }
        System.out.println("PASSWORD IS VALID. " +
                "\nPassCheck[" +
                "Username=" + username +
                ", Password=" + password +
                ']');

    }
}
