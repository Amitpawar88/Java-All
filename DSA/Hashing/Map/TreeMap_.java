package Map;

import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap<String, Integer> hm = new TreeMap<>();

        hm.put("India", 150);
        hm.put("China", 200);
        hm.put("US", 100);

        System.out.println(hm);
    }
}
