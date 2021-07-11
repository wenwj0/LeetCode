package linkedList;


import linkedList.ListNode;

public class S203_RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		while(head!=null && head.val == val){
			head = head.next;
		}
		if(head==null)
			return head;
		ListNode pre = head;
		ListNode p = head.next;
		while(p!=null){
			if(p.val==val){
				pre.next = p.next;
			}else {
				pre = pre.next;
			}
				p = p.next;
		}
		return head;
	}
	public ListNode removeElements0(ListNode head, int val) {
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
