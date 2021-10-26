package edu.northeastern.ashish.zheng;

import com.sun.source.tree.Tree;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        System.out.println(middleNode(node1).val);
    }


    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        this.val = x;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
