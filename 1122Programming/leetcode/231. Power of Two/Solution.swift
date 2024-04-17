/*
 *
 * https://leetcode.com/problems/power-of-two/
 * Problem ID: 231. Power of Two
 * 
 * Author: Ateto
 * 
 */

class Solution {
    func isPowerOfTwo(_ n: Int) -> Bool {
        if n <= 0 {
            return false
        }
        var tmp = n
        while tmp > 1 {
            if tmp&1 == 1 {
                return false
            }
            tmp >>= 1
        }
        return true
    }
}