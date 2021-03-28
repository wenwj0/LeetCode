package linkedList;

public class S142_LinkedListCycleII {
    public static void main(String[] args) {
        S142_LinkedListCycleII s = new S142_LinkedListCycleII();
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        s.detectCycle(a);
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode fast = head.next;
        ListNode slow = head.next;
        if (fast == null)
            return null;
        fast = fast.next;
        while (fast != null && fast != slow) {
            fast = fast.next;
            slow = slow.next;
            if (fast == null)
                return null;
            fast = fast.next;
        }
        if (fast == null)
            return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
