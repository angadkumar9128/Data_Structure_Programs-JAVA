
public class LinkedList {
    Node head;
    private int size;
    LinkedList(){
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
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        list.printList();
        System.out.println(list.length());
        list.deleteFirst();
        list.printList();
        System.out.println();
        list.dalateLast();
        list.printList();
        System.out.println(list.length());



    }
    
    
}