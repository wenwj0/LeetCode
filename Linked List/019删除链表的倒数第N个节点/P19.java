package leetcodeTest;

public class P19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
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
