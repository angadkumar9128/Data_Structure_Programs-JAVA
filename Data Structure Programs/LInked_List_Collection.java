import java.util.*;
public class LInked_List_Collection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        list.removeLast();
        list.removeFirst();
        list.add(3, "not");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        

    }
}
