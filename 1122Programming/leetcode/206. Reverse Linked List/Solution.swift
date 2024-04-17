/**
 * https://leetcode.com/problems/reverse-linked-list/description
 * Problem ID: 206. Reverse Linked List
 *
 * Author: Ateto
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     public var val: Int
 *     public var next: ListNode?
 *     public init() { self.val = 0; self.next = nil; }
 *     public init(_ val: Int) { self.val = val; self.next = nil; }
 *     public init(_ val: Int, _ next: ListNode?) { self.val = val; self.next = next; }
 * }
 */

class Solution {
    func reverseList(_ head: ListNode?) -> ListNode? {
        var current = head
        var prev: ListNode? = nil
        while current != nil {
            var nxt = current?.next
            current?.next = prev
            prev = current
            current = nxt
        }
        return prev
    }
}