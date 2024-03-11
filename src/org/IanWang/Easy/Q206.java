package org.IanWang.Easy;

import org.IanWang.Basic.SingleLinkedList.ListNode;

public class Q206 {
    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5,null);
        ListNode listNode4 = new ListNode(4,listNode5);
        ListNode listNode3 = new ListNode(3,listNode4);
        ListNode listNode2 = new ListNode(2,listNode3);
        ListNode listNode1 = new ListNode(1,listNode2);
        ListNode listNode = reverseList(listNode1);
        listNode.printAllData(listNode);
        //https://leetcode.com/problems/reverse-linked-list/solutions/2682085/java-0ms-100-easy-understanding/
        //It is because the link was generated from the last element to the first one, to make it reverse
        // is also need the head to be the last one continue to rewrite the content as the last one to be the head.

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
