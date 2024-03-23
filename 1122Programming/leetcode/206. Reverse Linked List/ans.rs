// https://leetcode.com/problems/reverse-linked-list/description
// Problem ID: 206. Reverse Linked List
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
    pub fn reverse_list(head: Option<Box<ListNode>>) -> Option<Box<ListNode>> {
        let mut ptr: Option<Box<ListNode>> = head;
        let mut rev: Option<Box<ListNode>> = None;

        while let Some(cur) = ptr {
            let mut parent = ListNode::new(cur.val);
            parent.next = rev.take();
            rev = Some(Box::new(parent));
            ptr = cur.next;
        }
        
        rev
    }
}
