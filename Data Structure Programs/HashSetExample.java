import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        // adding 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        // size of set
        System.out.println("Size of hashSet =" + set.size());

        // printing hash set element
        System.out.println(set);
        
        //searching element 
        if (set.contains(2)) {
            System.out.println("yes");
        }
        
        //deleteing hashset element
        set.remove(2);
        
        //Iterator in HashSet
        // Iterator<Integer> it = set.iterator();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        

    }
}
