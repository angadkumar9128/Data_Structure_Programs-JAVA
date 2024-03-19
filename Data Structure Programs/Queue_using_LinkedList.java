public class Queue_using_LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // enque
        public void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;

        }

        // peak
        public int peak() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;

        }
    }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.remove();

            while (!q.isEmpty()) {
                System.out.println(q.peak());
                ;
                q.remove();

            }
        }
    }

