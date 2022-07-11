package exerciseS05;

import linklist.linklist;

public class Find_out_first_and_last_occurrences  {
    public static void main(String[] args) {
        linklist lls = new linklist();

        lls.insert("1",1);
        lls.insert("2",2);
        lls.insert("3",3);
        lls.insert("5",5);
        lls.insert("6",6);
        lls.insert("6",6);
        lls.insert("6",6);
        lls.insert("8",8);
        lls.insert("9",9);
        lls.insert("10",10);
        lls.showint();
        lls.f_to_e_posection(6);
    }
}
