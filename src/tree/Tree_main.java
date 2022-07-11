package tree;

public class Tree_main {
    public static void main(String[] args) {

        Tree_Node root;

        Tree_Implementation a=new Tree_Implementation();

        root=a.insert(2);

        root.left=a.insert(7);

        root.right=a.insert(5);

        root.left.left=a.insert(2);

        root.left.right=a.insert(6);

        root.left.right.left=a.insert(5);

        root.left.right.right=a.insert(11);

        root.right.right=a.insert(9);

        root.right.right.left=a.insert(4);

        System.out.print("Inorder traversal:");

        a.inOrder(root);System.out.println();

        System.out.print("Preorder traversal:");

        a.preOrder(root);System.out.println();

        System.out.print("Postorder traversal:");

        a.postOrder(root);System.out.println();

    }


}
