package linkedList;

import linkedList.ListNode;

public class S237_DeleteNodeInALinkedList {
	public void deleteNode(ListNode node) {
		ListNode p = node;
		while(p.next.next!=null) {
			p.val = p.next.val;
			p=p.next;
		}
		p.next=null;
	}
}
