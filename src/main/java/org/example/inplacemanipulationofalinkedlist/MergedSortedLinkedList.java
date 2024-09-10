package org.example.inplacemanipulationofalinkedlist;

public class MergedSortedLinkedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(4);
        node1.next.next.next = new ListNode(5);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);
        node2.next.next.next = new ListNode(8);

        ListNode result = mergeTwoLists(node1, node2);
        while(result!=null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        } else if(list2==null){
            return list1;
        }
        ListNode head = list1;
        ListNode prev = null;
        while(list1!=null && list2!=null){

            while(list1.val <= list2.val){
                prev = list1;
                list1 = list1.next;
            }

                prev.next = list2;
                list2 = list1.next;

        }

        if(list1!=null){
            list1.next = list2;
        }

        if(list2!=null){
            list2.next = list1;
        }

        return head;
    }
}



 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
