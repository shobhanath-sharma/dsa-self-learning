package org.example.linkedlist;

import org.example.common.ListNode;

public class ReorderLinkedList {
    public static void main(String[] args) {
        ReorderLinkedList reorderLinkedList = new ReorderLinkedList();
        ListNode listNode = new ListNode(0);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next.next = new ListNode(6);
        reorderLinkedList.reorderList(listNode);
    }

    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        System.out.println("Head Element = "+head);
        ListNode midNode = getMidElement(head);
        System.out.println("Mid Element = "+midNode);
        ListNode reverseMidNode = reverseElement(midNode);
        System.out.println("ReverseMid Element = "+reverseMidNode);

        moveFirstHalfAndSecondHalfAndSwapElement(head, reverseMidNode);
        System.out.println("Current Head Element = "+head);

    }

    private static void moveFirstHalfAndSecondHalfAndSwapElement(ListNode firstHalf, ListNode secondHalf) {
        while(secondHalf !=null){
            ListNode nextFirst = firstHalf.next;
            ListNode nextSecond = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = nextFirst;
            firstHalf = nextFirst;
            secondHalf = nextSecond;
        }
    }

    private static ListNode reverseElement(ListNode head) {
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

    private static ListNode getMidElement(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
