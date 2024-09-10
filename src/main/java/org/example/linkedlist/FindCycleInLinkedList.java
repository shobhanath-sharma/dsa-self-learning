package org.example.linkedlist;

import org.example.common.ListNode;

public class FindCycleInLinkedList {
    public static void main(String[] args) {
        FindCycleInLinkedList reorderLinkedList = new FindCycleInLinkedList();
        ListNode listNode = new ListNode(0);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next.next.next = listNode.next.next.next.next;
        boolean result = reorderLinkedList.hasCycle(listNode);
        System.out.println("Found cycle = "+ result);
    }

    public boolean hasCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer==fastPointer){
                return true;
            }
        }

        return false;

    }
}
