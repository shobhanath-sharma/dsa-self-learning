package org.example.linkedlist;

import org.example.common.ListNode;

public class RemoveNodeFromEndOfLinkedList {

    public static void main(String[] args) {
        RemoveNodeFromEndOfLinkedList removeNodeFromEndOfLinkedList = new RemoveNodeFromEndOfLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        int n = 2;
        System.out.println("Head ==> " + head + " n=> " + n);
        ListNode result = removeNodeFromEndOfLinkedList.removeNodeFromEndOfLinkedListByN(head, n);
        System.out.println("New head ==> " + result);

        head = new ListNode(1);
        n = 1;
        System.out.println("Head ==> " + head + " n=> " + n);
        result = removeNodeFromEndOfLinkedList.removeNodeFromEndOfLinkedListByN(head, n);
        System.out.println("New head ==> " + result);

        head = new ListNode(1);
        head.next = new ListNode(2);
        System.out.println("Head ==> " + head + " n=> " + n);
        result = removeNodeFromEndOfLinkedList.removeNodeFromEndOfLinkedListByN(head, n);
        System.out.println("New head ==> " + result);

        head = new ListNode(1);
        head.next = new ListNode(2);
        n = 2;
        System.out.println("Head ==> " + head + " n=> " + n);
        result = removeNodeFromEndOfLinkedList.removeNodeFromEndOfLinkedListByN(head, n);
        System.out.println("New head ==> " + result);
    }

    private ListNode removeNodeFromEndOfLinkedListByN(ListNode head, int n) {
        if(null==head || n < 1){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        int counter = 0;
        while(fast!=null && counter < n){
            counter++;
            fast = fast.next;
            if(fast==null){
                head = head.next;
                return head;
            }
        }

        ListNode prev = null;
        while(fast!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = slow.next;

        return head;
    }
}


