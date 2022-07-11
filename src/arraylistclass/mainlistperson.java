package arraylistclass;

import java.util.Scanner;

public class mainlistperson {
    public static void main(String[] args) {
        arrayperson[] ap = new arrayperson[3];
        ap[0] = new arrayperson("abc", 11);
        ap[1] = new arrayperson("def", 61);
        ap[2] = new arrayperson("ihk", 18);
        int max = ap[0].getAge();
        for (int i = 1; i < ap.length; i++) {
            if (ap[i].getAge() > max)
                max = ap[i].getAge();
        }
        for (int i = 0; i < ap.length; i++) {
            if (ap[i].age == max)
                System.out.println("oldest =" + ap[i].name);
        }
        Scanner in=new Scanner(System.in);
        arrayperson p[]=new arrayperson[3];
        for(int i=0;i<p.length;i++) {
            System.out.println("Enter the name: ");
            String name=in.next();
            System.out.println("Enter the age: ");
            int age=in.nextInt();
            //p[i]=new Person();
            //p[i].setName(name);
            //p[i].setAge(age);
            p[i]=new arrayperson(name, age);
        }
        int max1=0,j=0,s= 0;

        String name = "";
        for(int i=0;i<p.length;i++) {
            //System.out.print(p[i].getName() + "\t");
            //System.out.println(p[i].getAge());
            if(p[i].age>max1) {
                max1=p[i].age;
                j=i;
            }
            if(p[i].name.length()>name.length()){
                name=p[i].name;
                s=i;
            }
        }
        System.out.print("\nThe oldest person is " + p[j].getName() + " with the age of " + p[j].age);
        System.out.print("\nThe longest person name is " + p[s].getName() + " with the age of " + p[s].age);


    }
}
