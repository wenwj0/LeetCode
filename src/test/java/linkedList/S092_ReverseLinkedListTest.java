package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S092_ReverseLinkedListTest {

    @Test
    void reverseBetween() {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(5);
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        S092_ReverseLinkedList test = new S092_ReverseLinkedList();
        test.reverseBetween(h1,2,4);
    }
}