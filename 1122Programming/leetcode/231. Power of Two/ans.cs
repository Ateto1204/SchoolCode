/*
 *
 * https://leetcode.com/problems/power-of-two/
 * Problem ID: 231. Power of Two
 * 
 * Author: asd7766zxc
 * 
 */

public class Solution {
    public bool IsPowerOfTwo(int n) {
        return Convert.ToString(n, 2).Select(i => i -'0').Sum() == 1 && n > 0;
    }
}