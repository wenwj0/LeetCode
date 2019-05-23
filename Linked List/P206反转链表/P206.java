
public class P206 {
	public ListNode reverseList(ListNode head) {
		if(head==null||head.next==null)
			return head;
		ListNode b = new ListNode(0);
		b.next = null;
		ListNode p = head;
		while(head!=null) {
			p = head;
			head = head.next;
			p.next = b.next;
			b.next = p;
		}
		return b.next;
	}
}
