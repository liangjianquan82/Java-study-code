package linklist;


import java.util.Scanner;

public class main_Linkedlist {//this is just to swap data of 2 nodes easily
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        linklist list=new linklist();
        int i,f,s;
        for(i=0;i<8;i++) {
            System.out.print("Enter a number: ");
            list.insert("",in.nextInt());
        }
        list.showint();
        System.out.print("Enter first position: ");
        f=in.nextInt();
        System.out.print("Enter second position: ");
        s=in.nextInt();
        int d1,d2;
        Node n=list.head;
        if(f==1)d1=list.head.intdata;
        else {
            for(i=1;i<f-1;i++)n=n.next;
            d1=n.next.intdata;
        }
        n=list.head;
        if(s==1)d2=list.head.intdata;
        else {
            for(i=1;i<s-1;i++)n=n.next;
            d2=n.next.intdata;
        }
        n=list.head;
        if(f==1)list.head.intdata=d2;
        else {
            for(i=1;i<f-1;i++)n=n.next;
            n.next.intdata=d2;
        }
        n=list.head;
        if(s==1)list.head.intdata=d1;
        else {
            for(i=1;i<s-1;i++)n=n.next;
            n.next.intdata=d1;
        }
        list.showint();
    }
}