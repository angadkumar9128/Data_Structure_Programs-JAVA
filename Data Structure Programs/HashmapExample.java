import java.util.*;

public class HashmapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
     
    // Insert
    map.put("India", 142);
    map.put("US", 32);
    map.put("Japan", 12);

    System.out.println(map);

    map.put("China", 140);

    // searching
    if (map.containsKey("Japan")) {
        System.out.println("Yas");
    }else{
        System.out.println("No");
    }

    System.out.println(map.get("India"));
    System.out.println(map.get("Russia"));

    // Iterate in HashMap
    for (Map.Entry<String, Integer> e : map.entrySet()) {
        System.out.println(e.getKey() + "," + e.getValue());
    }

    // Another method
    Set<String> keys = map.keySet();
    for (String key : keys) {
        System.out.println(key + ", " + map.get(key));
    }

    // Remove Element
    map.remove("China");
    System.out.println(map);

    }

}
