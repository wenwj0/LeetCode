package linkedList.P203移除链表的元素;


import linkedList.ListNode;

public class P203 {
	public ListNode removeElements(ListNode head, int val) {
		if(head==null)
			return head;
		if(head.next==null) {
			if(head.val==val)
				return null;
			else
				return head;
		}
		ListNode pre = new ListNode(val-1);
		pre.next = head;
		ListNode first = pre;
		ListNode p = head;
		while(p!=null) {
			if(p.val==val) {
				pre.next = p.next;
				p = pre.next;
			}else {
				p = p.next;
				pre = pre.next;
			}
		}
		return first.next;
	}
}
