/**
 * https://leetcode.com/problems/middle-of-the-linked-list
 * Problem ID: 876. Middle of the Linked List
 *
 * Author: Ateto
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode dummy = head;
        int n = 0;
        while(dummy != null) {
            dummy = dummy.next;
            n++;
        }
        for(int i = 0; i < n/2; i++) {
            head = head.next;
        }
        return head;
    }
}