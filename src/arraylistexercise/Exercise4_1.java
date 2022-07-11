package arraylistexercise;

import java.util.Scanner;

public class Exercise4_1 {
    public static void main(String[] args) {
        String str[] = {"liang", "eric", "eva", "fan", "jian", "ru", "quan", "yuan"};
        str = insert_sort_string_array(str);
        printlist(str);
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter search string: ");
        String x = in.next();

        int pos = bsearch(str,x);
        if (pos < 0) {
            System.out.println("Not in array");
        } else {
            System.out.println(x + " position " + pos );
        }

        in.close();
    }

    public static void printlist(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    public static int bsearch(String[] a, String v) {
        int pos = -1;
        int lower = 0;
        int upper = a.length - 1;
        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (a[mid].compareTo(v) == 0) {
                pos = mid;
                break;
            } else if (a[mid].compareTo(v) > 0) {
                upper = mid - 1;
            } else if (a[mid].compareTo(v) < 0) lower = mid + 1;
        }
        return pos;
    }


    public static String[] insert_sort_string_array(String a[]) {
        for(int i=1;i<a.length;i++){
            String str = a[i];
            int pos=0;
            for(int j=i-1;j>=0;j--){
                if(a[j].compareTo(str)>=0){
                    a[j+1] = a[j];
                }
                else{
                    pos = j+1;
                    break;
                }
            }
            a[pos] = str;
        }
        return a;
    }
}
