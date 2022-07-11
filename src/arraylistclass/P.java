package arraylistclass;

import java.util.ArrayList;

public class P {
    public static void main(String[] args) {
        ArrayList<String> arrliststr= new ArrayList<String>(10);
        ArrayList<Integer> arrlistint= new ArrayList<Integer>(10);
        arrliststr.add("String0");
        arrliststr.add("String1");
        arrliststr.add("String2");
        arrliststr.add("String3");
        arrliststr.add("String4");
        arrliststr.add("String5");
        arrliststr.add("String6");
        arrliststr.add("String7");
        arrliststr.add("String8");
        arrliststr.add("String9");

        arrlistint.add(0);
        arrlistint.add(1);
        arrlistint.add(2);
        arrlistint.add(3);
        arrlistint.add(4);
        arrlistint.add(5);
        arrlistint.add(6);
        arrlistint.add(7);
        arrlistint.add(8);
        arrlistint.add(9);

        System.out.println(arrliststr);
        System.out.println(arrlistint);

        for (int i = 0 ;i<arrliststr.size();i++){
           // arrliststr.remove(i);

                if ( i % 2 != 0){
                    System.out.println(arrliststr.get(i));
                }
        }
        //System.out.println(arrliststr);
        for (int i = 0 ;i<arrlistint.size();i++){
            //arrlistint.remove(i);
            if ( i % 2 == 0){
                System.out.println(arrlistint.get(i));
            }
        }
        //System.out.println(arrlistint);

    }
}
