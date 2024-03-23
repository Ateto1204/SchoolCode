// https://leetcode.com/problems/middle-of-the-linked-list
// Problem ID: 876. Middle of the Linked List
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
    pub fn middle_node(head: Option<Box<ListNode>>) -> Option<Box<ListNode>> {
        let mut ptr = head.clone();
        let mut len = 0_usize;
        while let Some(cur) = ptr {
            ptr = cur.next;
            len += 1;
        }
        let mut ans = head.clone();
        for i in 0..len/2 {
            ans = if let Some(cur) = ans { cur.next } else { panic!("") }
        }
        ans
    }
}
