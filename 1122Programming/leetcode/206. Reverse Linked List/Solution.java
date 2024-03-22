/**
 * https://leetcode.com/problems/reverse-linked-list/description
 * Problem ID: 206. Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while(current != null) {
            ListNode nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        return prev;
    }
}