package java.byOrder;

public class S024_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        ListNode pp = head.next;
        while(p!=null && pp!=null){
            ListNode temp = p.next;
            temp.next = pp.next;
            p.next = pp;
            pp.next = temp;
            p = temp;
            if(p.next==null)
                break;
            pp = p.next.next;
        }
        return dummy;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ListNode p = new S024_SwapNodesInPairs().swapPairs(a);
        System.out.println(p);
    }
}
