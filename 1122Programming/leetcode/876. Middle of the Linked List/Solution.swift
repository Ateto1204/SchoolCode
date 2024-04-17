/**
 * https://leetcode.com/problems/middle-of-the-linked-list
 * Problem ID: 876. Middle of the Linked List
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
    func middleNode(_ head: ListNode?) -> ListNode? {
        var quick = head
        var slow = head
        while quick?.next != nil {
            slow = slow?.next
            quick = quick?.next?.next
        }
        return slow
    }
}