/*
 *
 * https://leetcode.com/problems/palindrome-linked-list
 * Problem ID: 234. Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        List<Integer> listNode = new ArrayList<>();
        while(head != null) {
            listNode.add(head.val);
            head = head.next;
        }
        int n = listNode.size();
        for(int i = 0; i < n; i++) {
            if(listNode.get(i) != listNode.get(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}