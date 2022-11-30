package Map;

import java.util.HashMap;
import java.util.Set;

public class InBuildHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India", 150);
        hm.put("China", 200);
        hm.put("US", 100);
        hm.put("Nepal", 15);

        // System.out.println(hm);

        // // Get - O(1) - for valid key -> return valid value, for unvalid key -> return null
        // int population = hm.get("India");
        // System.out.println(population); // 150
        // System.out.println(hm.get("France")); // null
     
        // // ContainsKey - O(1)
        // System.out.println(hm.containsKey("India")); // true
        // System.out.println(hm.containsKey("France")); // false

        // // Remove - O(1)
        // System.out.println(hm.remove("China")); // 200
        // System.out.println(hm); 
        // System.out.println(hm.remove("France")); // null

        // // Size 
        // System.out.println(hm.size()); // 3

        // // isEmpty
        // hm.clear(); // it will clear all the key and data from HashMap
        // System.out.println(hm.isEmpty());


        /*     Iterate    */
        Set<String> keys = hm.keySet();
        System.out.println(keys); // [China, US, Nepal, India]

        for (String k : keys) {
            System.out.println("key = " + k + ", value = " + hm.get(k));
        }
        // hm.entrySet() -> keys with data
    }
}
