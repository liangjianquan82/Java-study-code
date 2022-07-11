package student;

import arraylistclass.arrayperson;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       Student [] st = new Student[5];

        for(int i = 0 ;i<st.length;i++){
            System.out.println("Enter the name: ");
            String name=in.next();
            System.out.println("Enter the age: ");
            int avarge=in.nextInt();
            st[i]=new Student(name, avarge);
        }
        for(int i = 0 ;i<st.length;i++) {

            int temp = 0;
            String name = "";
            for(int j=i+1;j<st.length;j++){
                if(st[j].getAverage()>st[i].getAverage()){
                    temp=st[i].getAverage();
                    name = st[i].getName();
                    st[i].setAverage(st[j].getAverage());
                    st[i].setName(st[j].getName());
                    st[j].setAverage(temp);
                    st[j].setName(name);

                }
            }

        }
        for(int i = 0 ;i<st.length;i++) {
            System.out.println("Stundent name: " + st[i].getName());
            System.out.println("Stundent average: " + st[i].getAverage());
        }
    }
}
