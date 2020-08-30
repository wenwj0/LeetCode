package byOrder;

import linkedList.ListNode;

public class S002_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int n = 0;
        int n1 = 0;
        int n2 = 0;
        int ca = 0;
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        ListNode node = null;
        while(l1!=null || l2!=null){
            n1 = l1==null?0:l1.val;
            n2 = l2==null?0:l2.val;
            n = n1 + n2 + ca;
            node = new ListNode(n%10);
            cur.next = node;
            cur = node;
            ca = n / 10;
            l1 = l1==null?null:l1.next;
            l2 = l2==null?null:l2.next;
        }
        if(ca!=0){
            node = new ListNode(ca);
            cur.next = node;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode l10 = new ListNode(2);
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(8);
        ListNode l20 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(0);
        l10.next = l11;
        l11.next = l12;
        l20.next = l21;
        l21.next = l22;
        ListNode res = new S002_AddTwoNumbers().addTwoNumbers(l10,l20);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
