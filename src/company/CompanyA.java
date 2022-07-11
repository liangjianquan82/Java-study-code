package company;

import java.util.ArrayList;

public class CompanyA implements Organize, Calculate {
    String [] name;
    int [] age;
    int [] salary;

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int[] getAge() {
        return age;
    }

    public void setAge(int[] age) {
        this.age = age;
    }

    public int[] getSalary() {
        return salary;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }
    /*
    highest salary
    */
    @Override
    public int calculate(int[] arr) {
        //ArrayList<Integer> list=new ArrayList<Integer>();
        int index = 0;
        int highest_salary = 0;

        for (int i = 0; i < arr.length; i++) {
            if (highest_salary < arr[i]) {
                highest_salary = arr[i];
                index = i;
            }
        }
        return index;
    }

    /*
    ascending order based on their name
     */
    @Override
    public String[] sort(String[] arr) {

        String [] show = new String[arr.length];


//        for (int i = 0; i < arr.length - 1; i++) {
//            if ((i + 1) < arr.length){
//                String pre = arr[i];
//                String next = arr[i + 1];
//
//                int apre = age[i];
//                int anext = age[i+1];
//
//                if(pre.compareToIgnoreCase(next)>0){
//                    String temp = pre;
//                    arr[i] = next;
//                    arr[i+1] = temp;
//
//                    int atemp = apre;
//                    age[i] = anext;
//                    age[i+1] = atemp;
//                }
//            }
//        }

        for(int j=0;j<name.length;j++) {
            for(int i=0;i<name.length-1;i++) {
                if(name[i].compareToIgnoreCase(name[i+1])>0) {
                    String temp=name[i];int temp1=age[i];int temp2=salary[i];
                    name[i]=name[i+1];age[i]=age[i+1];salary[i]=salary[i+1];
                    name[i+1]=temp;age[i+1]=temp1;salary[i+1]=temp2;
                }
            }
        }
        for(int i=0;i<show.length;i++){
            show[i] = arr[i]+" "+age[i]+" year old,";
        }
        return show;
    }

    public void showinfo(){
        System.out.println("Info. for Company A\n" +
                "\n" +
                "--------------------");
        int index = calculate(this.getSalary());
        System.out.println(getName()[index] + "has the highest salary.");
        System.out.println("Sorted list in ascending order based on name:");
        String [] show = sort(this.getName());
        for(int i=0;i<show.length;i++){
            System.out.print(show[i]);
        }
    }
}
