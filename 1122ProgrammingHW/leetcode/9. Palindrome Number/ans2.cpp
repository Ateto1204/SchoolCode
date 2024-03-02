/*
 *
 * https://leetcode.com/problems/palindrome-number/
 * Problem ID: 9. Palindrome Number
 * 
 * Author: Ateto
 * 
 */

class Solution {
public:
    bool isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 10) return true;
        
        long long reverse, tmp;
        reverse = 0, tmp = x;
        while(tmp) {
            reverse *= 10;
            reverse += tmp % 10;
            tmp /= 10;
        }
        return x == reverse;
    }
};