import java.util.*;

public class stack_using_ArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
           return list.size() == 0;
        }
        public void push(int data){
            list.add(data);
        }
        public Integer pick(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
        public int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top  = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;

        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.pick());
            s.pop();
        }



    }
}
