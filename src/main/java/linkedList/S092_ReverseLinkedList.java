package linkedList;

public class S092_ReverseLinkedList {
    public ListNode reverseBetween0(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        pre.next = head;
        ListNode p = head;
        int cnt = 1;
        int len = n - m + 1;
        while(pre!=null) {
            if(cnt == m) {
                break;
            }
            pre = pre.next;
            cnt ++;
        }
        head = pre.next;
        for(int i=0;i<len;i++) {
            p = head;
            head = head.next;
            p.next = pre.next;
            pre.next = p;
        }
        for(int i=0;i<len;i++)
            pre = pre.next;
        pre.next = head;
        return dummy.next;
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null)
            return head;
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode dummy = new ListNode(0);
        ListNode pre1 = dummy;
        dummy.next = head;
        int cnt = 1;
        while(cnt<n){
            if(cnt<m) {
                pre1 = pre1.next;
                p1 = p1.next;
            }
            if(cnt<n) {
                p2 = p2.next;
            }
            cnt++;
        }
        ListNode right = p2.next;
        p2.next = null;
        pre1.next = reverseList(p1);
        p1.next = right;
        return dummy.next;
    }
    public ListNode reverseList(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = null;
        ListNode p = head;
        while(head!=null){
            p = head;
            head= head.next;
            p.next = dummy.next;
            dummy.next = p;
        }
        return dummy.next;
    }
}
