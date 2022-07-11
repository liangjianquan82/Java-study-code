package tree;
//Write a program to create a tree based on the below image;
// and after creation, print the existing data following
// in-order, pre-order, and post-order approach.
public class Tree_main1 {
    public static void main(String[] args) {
        Tree_Node root = null;

        Tree_Implementation a=new Tree_Implementation();

        root=a.insert_Binary_StrTree(root,"judy");
        root=a.insert_Binary_StrTree(root,"bill");
        root=a.insert_Binary_StrTree(root,"alice");
        root=a.insert_Binary_StrTree(root,"fred");
        root=a.insert_Binary_StrTree(root,"dave");
        root=a.insert_Binary_StrTree(root,"jane");
        root=a.insert_Binary_StrTree(root,"joe");
        root=a.insert_Binary_StrTree(root,"mary");
        root=a.insert_Binary_StrTree(root,"ton");


        Tree_Implementation.Traversalstr(root);
        System.out.println();
//        a.inOrderstr(root);
//        System.out.println();
//        a.preOrderstr(root);
//        System.out.println();
//        a.postOrderstr(root);




    }
}
