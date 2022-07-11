package company;

public class CompanyB implements Organize, Calculate {
    String[] name;
    int[] age;
    int[] salary;

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
        youngest employee
         */
    @Override
    public int calculate(int[] arr) {
        int index  = 0;
        for (int i = 0; i < arr.length ; i++) {

            if ((i + 1) < arr.length){
                int pre = arr[i];
                int next = arr[i+1];

                if(pre>next){
                    index = i;
                }
            }
        }
        return index;
    }

    @Override
    public String[] sort(String[] arr) {
        String [] show = new String[arr.length];
        int [] sal = new int[arr.length];

//        for (int i = 0; i < arr.length ; i++) {
//            if ((i + 1) < arr.length){
//                int pre =Integer.valueOf(arr[i]) ;
//                int next = Integer.valueOf(arr[i+1]) ;
//
//                String npre = name_array[i];
//                String nnext = name_array[i+1];
//                if(pre<next){
//                    int temp = pre;
//                    arr[i] = ""+next;
//                    arr[i+1] = ""+pre;
//
//                    String ntemp = npre;
//                    name_array[i] = nnext;
//                    name_array[i+1] = ntemp;
//
//                }
//            }
//        }
        for(int j=0;j<name.length;j++) {
            for(int i=0;i<name.length-1;i++) {
                if(salary[i]<=salary[i+1]) {
                    String temp=name[i];int temp1=age[i];int temp2=salary[i];
                    name[i]=name[i+1];age[i]=age[i+1];salary[i]=salary[i+1];
                    name[i+1]=temp;age[i+1]=temp1;salary[i+1]=temp2;
                }
            }
        }
        for(int i=0;i<show.length;i++){
            show[i] = name[i]+" with "+ salary[i]+" salary,";
        }
        return show;
    }

    public void showinfo(){
        System.out.println("Info. for Company B\n" +
                "\n" +
                "--------------------");
        int index = calculate(this.getAge());
        System.out.println(getName()[index] + " is the younges.");
        System.out.println("Sorted list in descending order based on salary:");
        String  [] sal = new String[this.getSalary().length];
        for(int i=0;i<sal.length;i++){
            sal[i] =String.valueOf(this.getSalary()[i]);
        }
        String [] show = sort(sal);
        for(int i=0;i<show.length;i++){
            System.out.print(show[i]);
        }
    }
}
