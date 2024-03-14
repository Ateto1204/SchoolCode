/*
 *
 * https://leetcode.com/problems/palindrome-number/
 * Problem ID: 9. Palindrome Number
 * 
 * Author: revival0728
 * 
 */

impl Solution {
    pub fn is_palindrome(x: i32) -> bool {
        let x = x as i64;
        return if x >= 0 {
            let rev_x: i64 = x.to_string().chars().rev().collect::<String>().parse().unwrap();
            rev_x + x == (x << 1)
        } else {
            false
        };
    }
}
