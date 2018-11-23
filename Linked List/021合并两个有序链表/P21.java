package leetcodeTest;

public class P21 {
	public ListNode mergeTwoLists(ListNode l1,ListNode l2) {
		if(l1==null && l2==null)
			return null;
		else if(l1==null)
			return l2;
		else if(l2==null)
			return l1;
		ListNode head = l1.val<=l2.val?l1:l2;
		while(l1!=null && l2!=null) {
			if(l1.val<=l2.val) {
				
			}
			
			
		}
		
		
		
		return l1;
	}
}
