package tree;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex9_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean exit = true;
        Tree_Node root = null;
        Tree_Implementation a = new Tree_Implementation();
        System.out.println("Enter the total tree node: ");
        int number = in.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print("Enter word"+i+": ");
            String input = in.next();
            root = a.insert_Binary_StrTree(root,input);
        }

        ArrayList<ArrayList<Tree_Node>> arrtreerow = a.level_order_traversal_tree(root);
        for (int i = 0; i < arrtreerow.size(); i++) {
            for (int j = 0; j < arrtreerow.get(i).size(); j++) {
                System.out.print(arrtreerow.get(i).get(j).tree_strdate+" ");
            }
            System.out.println();
        }

    }
}
