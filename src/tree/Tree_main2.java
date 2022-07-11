package tree;

//2-WAP to accept 10 numbers from the user and create the binary tree accordingly.
// (Ensure that creation is done correctly)
//
//3-WAP to accept 10 numbers from the user and create the binary tree.
// Then accept another number and find out its number of occurrences in tree.
import queue.MyQueueL;

import java.util.ArrayList;
import java.util.Scanner;

public class Tree_main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean exit = true;
        Tree_Node root = null;
        Tree_Implementation a = new Tree_Implementation();

//        System.out.print("Enter 10 number: ");
//        for (int i = 0; i < 16; i++) {
//            int input = in.nextInt();
//            root = a.insert_Binary_Tree(root, input);
//        }
        root = a.insert_Binary_Tree(root, 7);
        root = a.insert_Binary_Tree(root, 3);
        root = a.insert_Binary_Tree(root, 12);
        root = a.insert_Binary_Tree(root, 9);
        root = a.insert_Binary_Tree(root, 8);
        root = a.insert_Binary_Tree(root, 11);
        root = a.insert_Binary_Tree(root, 10);
        root = a.insert_Binary_Tree(root, 13);
        root = a.insert_Binary_Tree(root, 15);
        root = a.insert_Binary_Tree(root, 14);
        root = a.insert_Binary_Tree(root, 1);
        root = a.insert_Binary_Tree(root, 6);
        root = a.insert_Binary_Tree(root, 0);
        root = a.insert_Binary_Tree(root, 2);
        root = a.insert_Binary_Tree(root, 4);
        root = a.insert_Binary_Tree(root, 5);


        a.inOrder(root);
        System.out.println();
        a.preOrder(root);
        System.out.println();
        a.postOrder(root);
        System.out.println();
        Tree_Implementation.Traversal(root);
        System.out.println();
        ArrayList<ArrayList<Tree_Node>> arrtreerow = a.level_order_traversal_tree(root);
//        System.out.print("Enter a search number: ");
//        int sc = in.nextInt();
//        int count = Tree_Implementation.seach(root,sc);
//        System.out.print("Occurrences in tree : "+count+" times.");
        for (int i = 0; i < arrtreerow.size(); i++) {
            for (int j = 0; j < arrtreerow.get(i).size(); j++) {
                System.out.print(arrtreerow.get(i).get(j).tree_date+" ");
            }
            System.out.println();
        }

    }
}
