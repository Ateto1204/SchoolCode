'''

https://leetcode.com/problems/two-sum/
Problem ID: 1. Two Sum

Author: GU_7

'''
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n <= 0:
            return False
        while n != 1:
            if n & 1:
                return False
            n >>= 1
        return True
