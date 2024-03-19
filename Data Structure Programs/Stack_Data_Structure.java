
public class Stack_Data_Structure {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack{
        public static Node head;
        public boolean isEmpty(){
            return head == null;
        }
        public void push(int data){
            Node newNode =new Node(data);
            if (isEmpty()) {
                head = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode ;
        }
        public int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public int pick(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        while (!st.isEmpty()) {
            System.out.println(st.pick());
            st.pop();
        }
    }
}