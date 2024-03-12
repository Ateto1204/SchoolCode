/*
 *
 * https://leetcode.com/problems/palindrome-number/
 * Problem ID: 9. Palindrome Number
 * 
 * Author: asd7766zxc
 * 
 */
public class Solution {
    public bool IsPalindrome(int x) {
        return x.ToString().ToList().Where((t,i) => x.ToString()[x.ToString().Length-i-1] == t).Count() == x.ToString().Length;
    }
}