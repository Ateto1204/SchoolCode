/**
 * https://leetcode.com/problems/find-the-pivot-integer/
 * Problem ID: 2485. Find the Pivot Integer
 *
 * Author: Ateto
 */

class Solution {
private: 
	int cal(int p, int q) {
        int tmp = (p + q) * (q - p + 1) / 2;
        return tmp;
    }
public: 
    int pivotInteger(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = (left + right) >> 1;
            int x = cal(1, mid);
            int y = cal(mid, n);
            if (x == y) return mid;
            if (x < y) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
};