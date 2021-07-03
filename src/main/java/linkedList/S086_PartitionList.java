package linkedList;

public class S086_PartitionList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(2);
        ListNode l7 = new ListNode(2);
        ListNode l8 = new ListNode(1);
        l7.next = l8;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        S086_PartitionList test = new S086_PartitionList();
        ListNode p = test.partition(l1, 3);
        ListNode p2 = test.partition(l7, 2);
        System.out.println();
    }

    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p1 = head;
        ListNode p2 = dummy;
        ListNode pre = dummy;
        while (p1 != null) {
            if (p1.val < x && p1 != p2) {
                ListNode tmp = p1;
                pre.next = p1.next;
                tmp.next = p2.next;
                p2.next = tmp;
                p2 = p2.next;
                p1 = pre.next;
            } else {
                pre = pre.next;
                p1 = p1.next;
            }
        }
        return dummy.next;
    }
}
