/*
 *
 * https://leetcode.com/problems/power-of-two/
 * Problem ID: 231. Power of Two
 * 
 * Author: revival0728
 * 
 */

macro_rules! lowbit { ($x: ident) => {$x & -$x} }
impl Solution {
    pub fn is_power_of_two(n: i32) -> bool {
        let mut n = n;
        return if n >= 0 {
            let mut bit_count = 0_i32;
            while n != 0 {
                n -= lowbit!(n);
                bit_count += 1;
            }
            bit_count == 1
        } else {
            false
        };
    }
}
