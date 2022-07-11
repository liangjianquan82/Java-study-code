package Ex10binarytree;

import java.util.ArrayList;

public class Binary_tree_implement {
    int flog = 0;

    Tree_Node insert(int intdata, String strdata) {
        Tree_Node n = new Tree_Node();
        n.intdata = intdata;
        n.strdata = strdata;
        n.left_node = null;
        n.right_node = null;
        return n;
    }

    Tree_Node insert_binary(Tree_Node node, Integer intdata) {
        return insert_binary(node, intdata, "");
    }

    Tree_Node insert_binary(Tree_Node node, String strdata) {
        return insert_binary(node, null, strdata);
    }

    Tree_Node insert_binary(Tree_Node node, Integer intdata, String strdata) {

        if (node == null) {
            return insert(intdata, strdata);
        }
        if (intdata != null) {
            if (intdata <= node.intdata) {
                node.left_node = insert_binary(node.left_node, intdata);

            } else if (intdata > node.intdata) {

                node.right_node = insert_binary(node.right_node, intdata);

            }
        }
        if (strdata != "") {
            if (strdata.compareTo(node.strdata) <= 0) {

                node.left_node = insert_binary(node.left_node, strdata);

            } else if (strdata.compareTo(node.strdata) > 0) {

                node.right_node = insert_binary(node.right_node, strdata);
            }
        }
        return node;

    }

    void inorder(Tree_Node n) {
        if (n == null) return;
        inorder(n.left_node);
        if (n.intdata != null) {
            System.out.print(n.intdata + " ");
        }
        if (n.strdata != "") {
            System.out.print(n.strdata + " ");
        }
        inorder(n.right_node);
    }

    void preorder(Tree_Node n) {
        if (n == null) return;
        if (n.intdata != null) {
            System.out.print(n.intdata + " ");
        }
        if (n.strdata != "") {
            System.out.print(n.strdata + " ");
        }
        inorder(n.left_node);
        inorder(n.right_node);
    }

    void postorder(Tree_Node n) {
        if (n == null) return;
        inorder(n.left_node);
        inorder(n.right_node);
        if (n.intdata != null) {
            System.out.print(n.intdata + " ");
        }
        if (n.strdata != "") {
            System.out.print(n.strdata + " ");
        }
    }

    void traversal(Tree_Node root) {
        int f = 0, r = 0;
        ArrayList<Tree_Node> tn = new ArrayList<>();
        if (root == null) return;
        tn.add(r++, root);
        Tree_Node n;
        while (f < r) {
            n = tn.get(f);
            if (n.intdata != null) {
                System.out.print(tn.get(f++).intdata + " ");
            }
            if (n.strdata != "") {
                System.out.print(tn.get(f++).strdata + " ");
            }

            if (n.left_node != null) {
                tn.add(r++, n.left_node);
            }
            if (n.right_node != null) {

                tn.add(r++, n.right_node);
            }
        }
    }

    int totalnodevalue(Tree_Node root) {
        int count = 0;
        int f = 0, r = 0;
        ArrayList<Tree_Node> tn = new ArrayList<>();
        if (root == null) return count;
        tn.add(r++, root);
        Tree_Node n;
        while (f < r) {
            n = tn.get(f);

            count += tn.get(f++).intdata;

            if (n.left_node != null) {
                tn.add(r++, n.left_node);
            }
            if (n.right_node != null) {

                tn.add(r++, n.right_node);
            }
        }
        return count;
    }

    Tree_Node deletenode(Tree_Node root, int value) {
        flog = 0;
        if (root == null) {
            return root;
        }
        //删除数值查找
        if (value < root.intdata) //删除的值小于节点值，进入节点左边查找。
        {
            root.left_node = deletenode(root.left_node, value);
            return root;
        } else if (value > root.intdata) //删除的值大于节点值，进入节点右边查找。
        {
            root.right_node = deletenode(root.right_node, value);
            return root;
        }
//      当找到删除的节点时。
        flog = 1;
        if(root.left_node==null)//删除节点左边下一节点为空，则将右边节点放入当前节点位置。
        {
            Tree_Node temp = root.right_node;
            return temp;
        }
        else if(root.right_node==null)//删除节点右边下一节点为空，则将左边节点放入当前节点位置。
        {
            Tree_Node temp = root.left_node;
            return temp;
        }
        else{//当左右下一节点都不为空
            Tree_Node perantNode = root;
            //
            Tree_Node minNode = root.right_node;
            while (minNode.left_node!=null){
                perantNode = minNode;
                minNode = minNode.left_node;
            }
            if(perantNode!=root){
                perantNode.left_node = minNode.right_node;
            }else{
                perantNode.right_node = minNode.right_node;
            }
            root.intdata = minNode.intdata;
            return root;
        }
    }
}
