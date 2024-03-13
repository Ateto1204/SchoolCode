/**
 * https://leetcode.com/problems/find-the-pivot-integer/
 * Problem ID: 2485. Find the Pivot Integer
 *
 * Author: Ateto
 */

 class Solution {
    private int cal(int p, int q) {
        int tmp = (p + q) * (q - p + 1) / 2;
        return tmp;
    }
    
    public int pivotInteger(int n) {
        for(int i = n; i >= 0; --i) {
            int x = cal(1, i);
            int y = cal(i, n);
            if(x == y) return i;
            if(x < y) break;
        }
        return -1;
    }
}