package leetcode;
//Definition for singly-linked list.

import java.math.BigInteger;

public class AddTwoSum {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static ListNode reverse(ListNode node)
    {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    static BigInteger getNode(ListNode node){
        BigInteger res = BigInteger.valueOf(0);
        while (node != null) {
            //System.out.print(node.val + " ");
            res = res.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(node.val));
            node = node.next;
        }
        return res;
    }

    public ListNode sumToList(BigInteger res){
        ListNode node = new ListNode();
        ListNode head = node;
        while (res.compareTo(BigInteger.valueOf(0)) == 1) {
            node.val = res.remainder(BigInteger.valueOf(10)).intValue();
            res = res.divide(BigInteger.valueOf(10));
            if (res.compareTo(BigInteger.valueOf(0)) == 1) {
                node.next = new ListNode();
                node = node.next;
            }
        }
        //System.out.println(getNode(head));
        return head;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //ListNode res = new ListNode();
        l1 = reverse(l1);
        l2 = reverse(l2);
        //System.out.println(getNode(l1));
        //System.out.println(getNode(l2));
        BigInteger sum = BigInteger.valueOf(0);
        //int sum = 0;
        sum = sum.add(getNode(l1)).add(getNode(l2));
        //System.out.println(sum);
        //sumToList(sum);
        //return res;
        return sumToList(sum);
    }

    public static void main(String[] args) {
        AddTwoSum addTwoSum = new AddTwoSum();
        ListNode l1 = addTwoSum.new ListNode(2);
        l1.next = addTwoSum.new ListNode(4);
        l1.next.next = addTwoSum.new ListNode(3);

        ListNode l2 = addTwoSum.new ListNode(5);
        l2.next = addTwoSum.new ListNode(7);
        l2.next.next = addTwoSum.new ListNode(8);

        System.out.println(getNode(addTwoSum.addTwoNumbers(l1, l2)));
        //System.out.println(getNode(addTwoSum.sumToList(342)));
    }
}
