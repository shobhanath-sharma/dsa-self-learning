package org.example.linkedlist;

import org.example.common.ListNode;

public class LinkedListReverse {
    //1->2->3->4->null
    //null <-1 <-2 <-3 <-4
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        System.out.println("Input listNode==> " + listNode);
        System.out.println("Output listNode==> " + reverse(listNode));
    }

    private static ListNode reverse(ListNode head) {
     ListNode prev = null;
     ListNode curr = head;
     while(curr!=null){
         ListNode newCurr = curr.next;
         curr.next = prev;
         prev = curr;
         curr = newCurr;
     }
     return prev;
    }
}
