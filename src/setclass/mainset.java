package setclass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class mainset {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();//random
        hs.add("Mahmoud");
        hs.add("Kyle");
        hs.add("Priya");
        hs.add("Young");
        hs.add("daniel");
        hs.add("Daniel");
        hs.add("Alex");
        System.out.print("HashSet: ");System.out.print(hs);System.out.println();
        Set<String> lhs = new LinkedHashSet<>();//as added
        lhs.add("Mahmoud");
        lhs.add("Kyle");
        lhs.add("Priya");
        lhs.add("Young");
        lhs.add("daniel");
        lhs.add("Daniel");
        lhs.add("Alex");
        System.out.print("LinkedHashSet: ");System.out.println(lhs);
        Set<String> ts = new TreeSet<>();//get sorted
        ts.add("Mahmoud");
        ts.add("Kyle");
        ts.add("Priya");
        ts.add("Young");
        ts.add("Daniel");
        ts.add("daniel");
        ts.add("Alex");
        System.out.print("TreeSet: ");System.out.print(ts);System.out.println();
    }
}
