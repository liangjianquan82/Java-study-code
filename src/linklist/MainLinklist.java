package linklist;

import arraylistclass.S;

import java.util.Scanner;

public class MainLinklist {
    public static void main(String[] args) {
        linklist lls = new linklist();

        lls.insert("1",1);
        lls.insert("2",2);
        lls.insert("3",3);
        lls.insert("5",5);
        lls.insert("6",6);
        lls.insert("6",6);
        lls.insert("7",7);
        lls.insert("8",8);
        lls.insert("9",9);
        lls.insert("10",10);
        lls.showint();


//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter search nb: 6");
//        int n = in.nextInt();
//        int n = 6;

//找到 两个要换位的数的位置；

        int indexf = 1;
        int indexs = 7;


        int dataf = lls.getint(indexf);//找到值
        String datafs = lls.getStr(dataf);
        int datas = lls.getint(indexs);
        String datass = lls.getStr(indexs);
        System.out.println( "index: "+indexf +" value:"+dataf);
        System.out.println( "index: "+indexs +" value:"+datas);
        lls.deleteAt(indexs);//先删除后面再删除前面
        lls.deleteAt(indexf);
        lls.showint();
        lls.insertat(indexf,datass,datas);//先插入前面再删除后面
        lls.insertat(indexs,datafs,dataf);
        lls.showint();



    }
}
