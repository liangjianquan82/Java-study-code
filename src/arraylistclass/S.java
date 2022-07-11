package arraylistclass;

import java.util.ArrayList;
import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> liststr = new ArrayList<String>();
        boolean flag = true;
        while (flag) {
            System.out.println("Wish to enter strings?(yes or no)");
            String choice = in.next();
            if (choice.equalsIgnoreCase("no")) flag = false;
            else {
                System.out.println("Enter the string: ");
                liststr.add(in.next());
            }
        }
        int z = liststr.size();
        for (int i = 0; i < z; i++) {
            for (int j = i + 1; j < z; j++) {
                if (liststr.get(i).equals(liststr.get(j))) {
                    liststr.remove(j);
                    j--;
                    z--;
                }
            }
        }
        System.out.println(liststr);
        in.close();
    }
}
