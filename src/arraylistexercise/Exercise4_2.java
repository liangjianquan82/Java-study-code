package arraylistexercise;

import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        int nb = in.nextInt();
        String strarray[] = new String[nb];
        for (int i = 0; i < nb; i++) {
            System.out.print("Please enter the word #" + (i + 1) + ": ");
            strarray[i] = in.next();
        }
        printlist(insert_sort_string_array(strarray));
        System.out.print("Enter a word : ");
        String  searchstr = in.next();
        int count = bsearch_count(strarray,searchstr);
        System.out.print(searchstr+" appear: "+ count);

    }
    public static void printlist (String a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    //找出出现几次
    public static int bsearch_count(String[] a, String v) {
        int pos = -1;
        int count=0;
        int lower = 0;
        int upper = a.length - 1;
        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (a[mid].compareTo(v) == 0) {
                pos = mid;
                count++;
                for(int p=pos-1;p>=lower;p--){
                    if (a[p].compareTo(v) == 0){
                        count++;
                    }
                }
                for(int n=mid+1;n<upper+1;n++){
                    if(a[n].compareTo(v) == 0){
                        count++;
                    }
                }
                break;
            } else if (a[mid].compareTo(v) > 0) {
                upper = mid - 1;
            } else if (a[mid].compareTo(v) < 0) lower = mid + 1;
        }
        return count;
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
