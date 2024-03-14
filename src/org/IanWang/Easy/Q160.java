package org.IanWang.Easy;

import org.IanWang.Basic.SingleLinkedList.ListNode;

public class Q160 {
    public static void main(String[] args) {
        ListNode c3 = new ListNode(10,null);
        ListNode c2 = new ListNode(9,c3);
        ListNode c1 = new ListNode(8,c2);
        ListNode a2 = new ListNode(6,c1);
        ListNode a1 = new ListNode(5,a2);
        ListNode b3= new ListNode(4,c1);
        ListNode b2= new ListNode(3,b3);
        ListNode b1= new ListNode(2,b2);
        getIntersectionNode(a1,b1);
    }


        public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB ==null)return null;

            ListNode cur1 = headA;
            ListNode cur2 = headB;

            while(cur1!=cur2){
                cur1 = cur1 == null? headB : cur1.next;
                cur2 = cur2 == null? headA : cur2.next;
                int show1 = 0;
                int show2 = 0;
                if(cur1!=null)show1=cur1.getData();
                if(cur2!=null)show2=cur2.getData();
                System.out.println("cur1 = "+ show1);
                System.out.println("cur2 = "+ show2);
            }
            return cur1;
        }
}
