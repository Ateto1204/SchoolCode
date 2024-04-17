/*
 *
 * https://leetcode.com/problems/palindrome-number/
 * Problem ID: 9. Palindrome Number
 * 
 * Author: Ateto
 * 
 */

class Solution {
    func isPalindrome(_ x: Int) -> Bool {
        if x < 0 {
            return false
        }
        if x < 10 {
            return true
        }
        var tmp = x
        var reverse = 0
        while tmp > 0 {
            reverse *= 10
            reverse += tmp%10
            tmp /= 10
        }
        return x == reverse
    }
}