package java.linkedList.P237删除链表中的节点;

public class P237 {
	public void deleteNode(ListNode node) {
		ListNode p = node;
		while(p.next.next!=null) {
			p.val = p.next.val;
			p=p.next;
		}
		p.next=null;
	}
}
