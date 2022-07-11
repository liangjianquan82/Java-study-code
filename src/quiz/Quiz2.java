package quiz;


import java.util.Scanner;
public class Quiz2 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How many words do you want to enter? ");
        int nb = in.nextInt();
        String a[] = new String[nb];
        for (int i = 0; i < nb; i++) {
            System.out.println("Enter the word: ");
            String wordStr = in.next();
            a[i] = wordStr;
        }
        print_out(insert_sort(a));
        in.close();

    }

    public static String [] insert_sort(String aStr[] ) {
        for(int i=1;i<aStr.length;i++) {
            int pos = 0;
            String temp = aStr[i];
            for(int j=i-1;j>=0;j--){
                if(aStr[j].compareTo(temp)>0){
                    aStr[j+1]=aStr[j];
                }
                else{
                    pos = j+1;
                    break;
                }
            }
            aStr[pos] = temp;
        }

        return aStr;
    }
    public static void print_out(String a[]) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] != null)
                System.out.print(a[i] + " ");

        }
        System.out.println();
        for(int i = 0; i < a.length; i++) {
            int j=print_out1(a[i],a);
            i=j;
        }
    }

    public static int print_out1(String temp,String a[]) {
        String position = "";
        int count = 0;
        int j=0;
        for (int i =0; i < a.length; i++) {
            if(a[i].compareTo(temp)==0) {
                count++;
                j=i;
                position = position+(j+1)+",";
            }
        }
        System.out.println("The word "+ temp +", in position "+position + " is repeated for "+count+" times.");
        return j;
    }

}

