
public class P92 {
	public ListNode reverseBetween(ListNode head,int m,int n) {
		ListNode head0 = new ListNode(0);
		ListNode pre = head0;
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
		return head0.next;
	}
}
