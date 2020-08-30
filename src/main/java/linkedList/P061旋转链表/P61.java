package linkedList.P061旋转链表;

import linkedList.ListNode;

public class P61 {
public ListNode rotateRight(ListNode head, int k) {
		if(head==null || head.next==null)
			return head;
        ListNode p = head;
        int cnt = 0;
        while(p!=null) {
        	cnt ++;
        	p = p.next;
        }
        if(cnt<=k)
        	k %=cnt;
        if(cnt==0)
        	return head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        p = pre;
        ListNode p2 = pre;
        while(k-->0)
        	p2 = p2.next;
        while(p2.next!=null) {
        	p2 = p2.next;
        	p = p.next;
        }
        p2.next = pre.next;
        pre.next = p.next;
        p.next = null;

		return pre.next;
    }
}
