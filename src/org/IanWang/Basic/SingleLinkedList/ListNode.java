package org.IanWang.Basic.SingleLinkedList;

public class ListNode {
    int data;
    public ListNode next;

    ListNode() {
    }
    ListNode(int data) {
        this.data = data;
    }
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void printAllData(ListNode head) {
        ListNode N = head;
        System.out.println(head.getData());
        while(N.getNext()!=null) {
            System.out.println(N.getNext().getData());
            N = N.getNext();
        }
        System.out.print("\n");
    }

}
