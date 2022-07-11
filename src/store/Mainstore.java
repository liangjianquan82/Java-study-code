package store;

import java.util.Scanner;

public class Mainstore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the mobile store name:");
        String store_name = sc.next();
        MobileStore ms = new MobileStore(store_name);
        System.out.println("Please enter sale info:");
        double month_sale_price[] = new double[12];
        int month_sale_hand_sets[] = new int[12];
        for(int i = 0; i < 12; i++){
            System.out.print("Enter price "+(i+1)+" month:");
            month_sale_price[i]=sc.nextDouble();
            System.out.print("Enter numbers "+(i+1)+" month:");
            month_sale_hand_sets[i]=sc.nextInt();
        }
        ms.setInfo(month_sale_hand_sets,month_sale_price);
        System.out.println(ms.toString());
        System.out.println(ms.month_most_sale());

        sc.close();
    }

}
