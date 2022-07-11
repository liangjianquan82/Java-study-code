package passwordcheck;

import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the user name: ");
        String user=in.next();
        System.out.println("Enter the password: ");
        String pass=in.next();
        PassCheckForT pc=new PassCheckForT(user,pass);
    }
}
