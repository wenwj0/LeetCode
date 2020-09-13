package linkedList;

public class S061_RotateList {
    /**
     * Leetcode solution
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        // base cases
        if (head == null) return null;
        if (head.next == null) return head;

        // close the linked list into the ring
        ListNode old_tail = head;
        int n;
        for(n = 1; old_tail.next != null; n++)
            old_tail = old_tail.next;
        old_tail.next = head;

        // find new tail : (n - k % n - 1)th node
        // and new head : (n - k % n)th node
        ListNode new_tail = head;
        for (int i = 0; i < n - k % n - 1; i++)
            new_tail = new_tail.next;
        ListNode new_head = new_tail.next;

        // break the ring
        new_tail.next = null;

        return new_head;
    }

    public ListNode rotateRight0(ListNode head, int k) {
        if (k==0 || head==null)
            return head;
        int len = 0;
        ListNode p = head;
        while(p!=null){
            len++;
            p = p.next;
        }
        k=len - k%len;
        if(len==k)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        p = dummy;
        while(k>0){
            p = p.next;
            k--;
        }
        dummy.next = p.next;
        p.next = null;
        p = dummy.next;
        while(p.next!=null){
            p = p.next;
        }
        p.next = head;
        return dummy.next;
    }
}
