package linkedList;

import linkedList.ListNode;

public class S141_LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=null && slow !=null){
            if(fast==slow)
            	return true;
            if(slow.next==null)
            	return false;
            slow = slow.next;
            if(fast.next!=null)
                fast = fast.next.next;
            else
                return false;
        }
        return false;		
		
		
		
	}
}