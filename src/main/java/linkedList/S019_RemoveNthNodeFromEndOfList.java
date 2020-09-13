package linkedList;


import linkedList.ListNode;


public class S019_RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for(int i=0;i<n;i++){
            first = first.next;
        }
        while(first.next!=null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
    public ListNode removeNthFromEnd0(ListNode head, int n) {
        if(head == null)
            return null;
        if(head.next==null) {
            if(n==1)
                return null;
        }
        ListNode pre = new ListNode(1);
        pre.next = head;
        ListNode fast = pre.next;
        ListNode slow = pre;
        int cnt = 1;
        while(fast.next!=null && cnt < n) {
            fast = fast.next;
            cnt ++;
        }
        while(fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return pre.next;
    }
}
