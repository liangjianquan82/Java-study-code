package linklist;

public class linklist {
    Node head;

    public void insert(String data, int intdata) {
        Node n = new Node();
        n.intdata = intdata;
        n.Strdata = data;
        n.next = null;
        if (head == null) {
            head = n;
        } else {
            Node n1 = head;//start from beginning of list
            while (n1.next != null) {
                n1 = n1.next;
            }
            n1.next = n;

        }
    }

    public void deleteAt(int index) {
        Node n = head;
        int count = 0;
        if (index == 0) {
            head = head.next;
            n = null;
            return;
        }
        while (n.next != null) {
            count++;
            if (count == index) {
                Node n1 = n.next;
                n.next = n1.next;
                n1 = null;
                break;
            } else {
                n = n.next;
            }
        }
    }

    public void insertatstart(String data, int intdata) {
        //adding to the beginning
        Node node = new Node();
        node.Strdata = data;
        node.intdata = intdata;
        node.next = null; //can be eliminated
        node.next = head;
        head = node;

    }

    public void insertat(int index, String data, int intdata) {
        if (index == 0) insertatstart(data, intdata);
        else {
            Node node = new Node();
            node.Strdata = data;
            node.intdata = intdata;
            node.next = null;
            Node n1 = head;
            for (int i = 1; i < index; i++) {
                n1 = n1.next;
            }
            node.next = n1.next;
            n1.next = node;
        }

    }

    public void showstr() {
        Node n = new Node();
        n = head;
        while (n.next != null) {
            System.out.print(n.Strdata);
            n = n.next;
        }
        System.out.print(n.Strdata);
        System.out.println();
    }

    public void showint() {
        Node n = new Node();
        n = head;
        while (n.next != null) {
            System.out.print(n.intdata);
            n = n.next;
        }
        System.out.print(n.intdata);
        System.out.println();
    }



    public String getStr(int index) {
        Node n = head;
        int i = 0;
        while (i < index) {
            n = n.next;
            i++;
        }
        return n.Strdata;
    }

    public int getint(int index) {
        Node n = head;
        int i = 0;
        while (i < index) {
            n = n.next;
            i++;
        }
        return n.intdata;
    }

    public  void f_to_e_posection(int n) {
        Node nn = head;
        int count = 0;
        int f = 0;
        int fn = 0;
        int e = 0;
        boolean loop = true;
        while (head != null) {
            if (head.intdata == 6 && fn == 0) {
                f = count;
                fn++;

            } else if (head.intdata > 6) {
                e = count - 1;
                break;
            }
            count++;
            head = head.next;

        }
        System.out.println(n + "first:" + f + "laset:" + e);
    }

    public int size() {
        Node n = head;
        int size = 0;
        while (n != null) {
            size++;
            n = n.next;
        }
        return size;
    }

    public void set(int index, int intdata,String strdata){
        checkElementIndex(index);
        Node n = head;
        int i = 0;
        while(i<index){
            n = n.next;
            i++;
        }
        n.intdata = intdata;
        n.Strdata = strdata;
    }

    private void checkElementIndex(int index){
        if(index<0 || index>=size())
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size();
    }

}
