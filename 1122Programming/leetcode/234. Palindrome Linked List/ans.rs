// https://leetcode.com/problems/palindrome-linked-list/
// Problem ID: 234. Palindrome Linked List
//
// Author: revival0728
//
// Definition for singly-linked list.
// #[derive(PartialEq, Eq, Clone, Debug)]
// pub struct ListNode {
//   pub val: i32,
//   pub next: Option<Box<ListNode>>
// }
// 
// impl ListNode {
//   #[inline]
//   fn new(val: i32) -> Self {
//     ListNode {
//       next: None,
//       val
//     }
//   }
// }
impl Solution {
    pub fn is_palindrome(head: Option<Box<ListNode>>) -> bool {
        let mut ptr = head;
        let mut stk = Vec::new();
        
        while let Some(cur) = ptr {
            stk.push(cur.val);
            ptr = cur.next;
        }
        for (i, r) in stk.iter().zip(stk.iter().rev()) {
            if i != r {
                return false
            }
        }
        true
    }
}
