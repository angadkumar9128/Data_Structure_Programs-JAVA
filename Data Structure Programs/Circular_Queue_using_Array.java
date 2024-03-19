public class Circular_Queue_using_Array {
    static class Queue {
        static int arr[];
        int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty() {
            return front ==1 && rear == -1;
        }
        public boolean isFull(){
            return (rear + 1) % size == front;
        }

        // add
        public void add(int data) {
            if (isFull()) {
                System.out.println();
                return;
            }
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear]  = data;
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[0];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            
            return result;

        }

        // peak
        public int peak() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];

        }
    }

        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            System.out.println(q.remove());
            q.add(6);
            
           
            

            while (!q.isEmpty()) {
                System.out.println(q.peak());
                q.remove();

            }
        }
    }

