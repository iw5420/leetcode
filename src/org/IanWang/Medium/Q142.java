package org.IanWang.Medium;

import org.IanWang.Basic.SingleLinkedList.ListNode;

public class Q142 {
    // (X+Y)*2 = X + Y + N(Y+Z)
    // N = 1
    // 2X + 2Y = X + 2Y +Z
    // X = Z
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)break;
        }
        if(fast == null|| fast.next == null)return null;
        fast = head;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
