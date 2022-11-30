package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class All_Set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(3);
        hs.add(1);
        hs.add(65);
        
        System.out.println(hs);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        
        lhs.add(1);
        lhs.add(2);
        lhs.add(4);
        lhs.add(3);
        lhs.add(1);
        lhs.add(65);

        System.out.println(lhs);

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(2);
        ts.add(4);
        ts.add(3);
        ts.add(1);
        ts.add(65);

        System.out.println(ts);


        // // iteration on hashSet 
        // // using Iterator
        // Iterator it = hs.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // // using Enhanced for loop
        // for (int i : hs) {
        //     System.out.println(i);
        // }

        // // System.out.println(hs);
        // // hs.clear();
        // // System.out.println(hs.size());
    }
}
