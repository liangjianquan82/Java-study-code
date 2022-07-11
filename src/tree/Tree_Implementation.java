package tree;

import java.util.ArrayList;

public class Tree_Implementation {
    Tree_Node insert(int data) {
        Tree_Node n = new Tree_Node();
        n.tree_date = data;
        n.left = null;
        n.right = null;
        n.slashandbackslask = "|";
        return n;
    }
//    public Tree_Node insert_Binary_Tree(Tree_Node node, int data){
//
//        return insert_Binary_Tree( node,  data,"");
//    }

    /**
     * 插入二叉树型，整数，比节点小的在左边，比节点大的在右边
     *
     * @param node 上一级节点
     * @param data 整数
     * @return 返回树
     */
    public Tree_Node insert_Binary_Tree(Tree_Node node, int data) {
        if (node == null) {
            Tree_Node n = new Tree_Node();
            n.tree_date = data;
            n.left = null;
            n.right = null;
            n.slashandbackslask = "";
            return n;
        }
        if (data <= node.tree_date) {
            node.left = insert_Binary_Tree(node.left, data);
            node.left.slashandbackslask = "/";
        } else if (data > node.tree_date) {

            node.right = insert_Binary_Tree(node.right, data);
            node.right.slashandbackslask = "\\";
        }
        return node;
    }

    //    public Tree_Node insert_Binary_StrTree(Tree_Node node, String data){
//
//        return insert_Binary_StrTree( node,  data,"");
//    }
    public Tree_Node insert_Binary_StrTree(Tree_Node node, String data) {
        if (node == null) {
            Tree_Node n = new Tree_Node();
            n.tree_strdate = data;
            n.left = null;
            n.right = null;
            n.slashandbackslask = "|";
            return n;
        }
        if (data.compareTo(node.tree_strdate) <= 0) {

            node.left = insert_Binary_StrTree(node.left, data);
            node.left.slashandbackslask = "/";
        } else if (data.compareTo(node.tree_strdate) > 0) {

            node.right = insert_Binary_StrTree(node.right, data);
        }
        return node;
    }

    /**
     * 顺序遍历树形
     *
     * @param n
     */
    void inOrder(Tree_Node n) {
        if (n == null) {
            return;
        }
        inOrder(n.left);
        System.out.print(n.tree_date + " ");
        inOrder(n.right);
    }

    void inOrderstr(Tree_Node n) {
        if (n == null) {
            return;
        }
        inOrderstr(n.left);
        System.out.print(n.tree_strdate + " ");
        inOrderstr(n.right);
    }

    /**
     * 前序遍历树形
     *
     * @param n
     */
    void preOrder(Tree_Node n) {
        if (n == null) {
            return;
        }
        System.out.print(n.tree_date + " ");
        preOrder(n.left);
        preOrder(n.right);
    }

    void preOrderstr(Tree_Node n) {
        if (n == null) {
            return;
        }
        System.out.print(n.tree_strdate + " ");
        preOrderstr(n.left);
        preOrderstr(n.right);
    }

    /**
     * 后序遍历树形
     *
     * @param n
     */
    void postOrder(Tree_Node n) {
        if (n == null) {
            return;
        }
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.tree_date + " ");
    }

    void postOrderstr(Tree_Node n) {
        if (n == null) {
            return;
        }
        postOrderstr(n.left);
        postOrderstr(n.right);
        System.out.print(n.tree_strdate + " ");
    }

    public static void Traversal(Tree_Node root) {
        int r = 0, f = 0;
        Tree_Node que[] = new Tree_Node[20];
        if (root == null) return;
        que[r++] = root;
        Tree_Node n;
        while (f < r) {
            n = que[f];
            System.out.print(que[f++].tree_date + " ");
            if (n.left != null) que[r++] = n.left;
            if (n.right != null) que[r++] = n.right;
        }
    }

    public static void Traversalstr(Tree_Node root) {
        int r = 0, f = 0;
        Tree_Node que[] = new Tree_Node[20];
        if (root == null) return;
        que[r++] = root;
        Tree_Node n;
        while (f < r) {
            n = que[f];
            System.out.print(que[f++].tree_strdate + " ");
            if (n.left != null) que[r++] = n.left;
            if (n.right != null) que[r++] = n.right;
        }
    }

    public static int seach(Tree_Node root, int sc) {
        int count = 0;
        int r = 0, f = 0;
        Tree_Node que[] = new Tree_Node[20];
        if (root == null) {
            return count;
        }
        que[r++] = root;
        Tree_Node n;
        while (f < r) {
            n = que[f];
            if (que[f++].tree_date == sc) {
                count++;
            }
            if (n.left != null) {
                que[r++] = n.left;
            }
            if (n.right != null) {
                que[r++] = n.right;
            }
        }

        return count;
    }

    public ArrayList<ArrayList<Tree_Node>> level_order_traversal_tree(Tree_Node root) {

        ArrayList<Tree_Node> arrtree = new ArrayList<>();
        ArrayList<ArrayList<Tree_Node>> arrtreerow = new ArrayList<>();
        if (root == null) return null;
        int front = 0, rear = 0, row = 0;
        //int column = 0;
        Tree_Node n;

        //思路：
        // 先将一层节点全部放入二维数组的一行，
        arrtree.add(root);
        arrtreerow.add(row, arrtree);

        //遍历改层数组，将组中点的下一层节点全部放入二维数组的下一行。
        //以此重复遍历树，则该树将会在二维数组中存储下来。
        while (arrtreerow.get(row).size() != 0) {
            ArrayList<Tree_Node> arrtreenextrow = new ArrayList<>();

//            n = arrtreerow.get(row).get(0);
//            int arrsize = arrtree.get(r)
            for (int j = 0; j < arrtreerow.get(row).size(); j++) {
                n = arrtreerow.get(row).get(j);
                if (n.left != null) {
                    arrtreenextrow.add(n.left);

                }
                if (n.right != null) {
                    arrtreenextrow.add(n.right);

                }
            }
            row++;
            if (arrtreenextrow.size() == 0) {
                break;
            } else {
                arrtreerow.add(row, arrtreenextrow);
            }
        }

        return arrtreerow;

    }
}


