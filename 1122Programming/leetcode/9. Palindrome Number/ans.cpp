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

        string str;
        while(x) {
            str.push_back('0' + x%10);
            x /= 10;
        }
        for(int i=0; i<str.size()/2; i++) {
            if(str[i] != str[str.size()-1-i]) return false;
        }
        return true;
    }
};