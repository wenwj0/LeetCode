/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class P21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null && l2==null)
			return null;
		else if(l1==null)
			return l2;
		else if(l2==null)
			return l1;
		ListNode head = new ListNode(0);
		ListNode p = head;
		while(l1!=null && l2!=null) {
			if(l1.val<=l2.val) {
				p.next = l1;
				l1 = l1.next;
			}else {
				p.next = l2;
				l2 = l2.next;
			}
			p = p.next;
		}
		if(l1!=null)
			p.next = l1;
		if(l2!=null)
			p.next = l2;
		return head.next;  
    }
}