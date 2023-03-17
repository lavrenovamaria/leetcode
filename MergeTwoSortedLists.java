package leetcode;

import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode copyList(){
            ListNode list = new ListNode();
            list.val = this.val;
            list.next = this.next;
            return list;
        }
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.printf("%d ", node.val);
            node = node.next;
        }
    }

    ListNode addElems(ListNode head, int start, int step, int end){
        if (head == null)
            head = new ListNode(0);
        ListNode tmp = head;
            tmp.next = head.next;
        for (int i = start; i < end; i += step){
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }
        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedLists merged = new MergeTwoSortedLists();
        ListNode l1 = merged.new ListNode(1);
        l1 = merged.addElems(null, 2, 2, 5000);
        ListNode l2 = merged.new ListNode(1);
        l2 = merged.addElems(null, 1, 2, 5000);

        long start = System.nanoTime();
        merged.mergeTwoLists(l1, l2);
        System.out.println("MS: " + (float)(System.nanoTime()/1000.0 - start/1000.0));

    }
}
