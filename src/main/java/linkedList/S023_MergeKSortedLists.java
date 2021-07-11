package linkedList;

public class S023_MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (true) {
            int index = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && lists[i].val < min) {
                    min = lists[i].val;
                    index = i;
                }
            }
            if (index == -1) {
                break;
            }
            p.next = lists[index];
            p = p.next;
            lists[index] = lists[index].next;
        }
        return dummy.next;
    }
}
