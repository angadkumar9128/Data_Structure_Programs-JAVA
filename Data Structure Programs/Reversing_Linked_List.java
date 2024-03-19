public class Reversing_Linked_List {
    
    Node head;
    private int size;
    Reversing_Linked_List(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        size++;
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
            
        }
        currNode.next = newNode;

    }
    public void printList(){
        if (head == null) {
            System.out.println("List is Empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }
    //delete first
    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }
    //delete last
    public void dalateLast(){
        Node preLast = head;
        Node last = head.next;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        while (last.next != null) {
            last = last.next;
            preLast = preLast.next;

        }
        preLast.next = null;
    }
    
    public int length(){
        System.out.println();
        return size;
    }

    public void reverseIterate(){
        if (head == null || head.next == null) {
            return ;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;


    }
    public Node reverseRecursive(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        list.printList();
        list.reverseIterate();
        list.head = list.reverseRecursive(list.head);
        list.printList();
        System.out.println(list.length());
        list.deleteFirst();
        list.printList();
        list.dalateLast();
        list.printList();
        System.out.println(list.length());



    }
    
}

