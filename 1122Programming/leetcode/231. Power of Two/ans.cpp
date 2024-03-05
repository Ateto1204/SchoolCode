/*
 *
 * https://leetcode.com/problems/power-of-two/
 * Problem ID: 231. Power of Two
 * 
 * Author: Ateto
 * 
 */

class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n <= 0) return false;
        while(n != 1) {
            if(n & 1) return false;
            n >>= 1;
        }
        return true;
    }
};