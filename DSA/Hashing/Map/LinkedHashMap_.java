package Map;

import java.util.LinkedHashMap;

public class LinkedHashMap_ {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 150);
        lhm.put("China", 200);
        lhm.put("US", 100);

        System.out.print(lhm);
    }
}
