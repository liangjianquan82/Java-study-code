package arraylistclass;

import java.util.ArrayList;
//Write a program that accepts names in an ArrayList of Strings
//        and replaces a string of four asterisks "****" in place of every string of length 4.
//        For example,
//        suppose that a list contains the following values:
//        {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"} ;
//and now your code changes it to
//        {"****", "is", "****" , "of", "fun", "for", "every", "****",  "programmer"}.

public class R {
    public static void main(String[] args) {
        ArrayList<String> liststr= new ArrayList<String>();
        liststr.add("this");
        liststr.add("is");
        liststr.add("lots");
        liststr.add("of");
        liststr.add("fun");
        liststr.add("for");
        liststr.add("every");
        liststr.add("Java");
        liststr.add("programmer");

        for(int i = 0 ;i<liststr.size();i++){
            if(liststr.get(i).length()==4){
                liststr.remove(i);
                liststr.add(i,"****");
                //liststr.set(i,"****");
            }
        }
        System.out.println(liststr);

    }
}
