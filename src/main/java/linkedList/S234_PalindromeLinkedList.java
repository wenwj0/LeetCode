package linkedList;

import linkedList.ListNode;

public class S234_PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		if(head==null||head.next==null)
			return true;
		int length = 1;
		ListNode temp = head.next;
		while(temp!=null) {
			length++;
			temp = temp.next;
		}
		temp = head;
		ListNode pNode = temp;
		for(int i=0;i<length/2;i++) {
			if(i==length/2-1) {
				pNode = temp;
			}
			temp = temp.next;
		}
		ListNode pre = pNode;
		pre.next = null;
		ListNode p = temp;
		while(temp!=null) {
			temp = temp.next;
			p.next = pre.next;
			pre.next = p;
			p = temp;
		}
		temp = head;
		p = pre.next;
		while(temp!=pNode.next&&p!=null) {
			if(p.val!=temp.val)
				return false;
			temp=temp.next;
			p = p.next;
		}
		return true;
	}
}
