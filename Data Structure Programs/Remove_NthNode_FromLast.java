import java.util.List;

public class Remove_NthNode_FromLast {
    public ListNode remove_nthNode(ListNode head, int n){
        if (head == null) {
            return head;
        }
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;


    }
    public static void main(String[] args) {
        
    }
}
