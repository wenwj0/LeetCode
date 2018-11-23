package leetcodeTest;
public class P160 {
	public ListNode getIntersectionNode(ListNode headA,ListNode headB) {
		ListNode p1 = headA,p2 = headB;
		int cnt1 = 0,cnt2 = 0;
		while(p1!=null) {
			cnt1 ++;
			p1 = p1.next;
		}
		while(p2!=null) {
			cnt2 ++;
			p2 = p2.next;
		}
		p1 = headA;
		p2 = headB;
		if(cnt1>=cnt2) {
			int d = cnt1-cnt2;
			int cnt3 = 0;
			while(cnt3!=d&&p1!=null) {
				p1= p1.next;
				cnt3++;
			}
		}else {
			int d = cnt2-cnt1;
			int cnt3 = 0;
			while(p2!=null && cnt3!=d) {
				p2= p2.next;
				cnt3++;
			}
		}
		while(p1!=null && p2!=null && p1!=p2) {
			p1=p1.next;
			p2=p2.next;
		}
		return p1;
	}
}
