'''

https://leetcode.com/problems/find-the-town-judge/
Problem ID: 997. Find the Town Judge

Author: GU_7

'''
class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        N = 1005
        hasTrusted = [False for i in range(N)]
        beTrusted = [0 for i in range(N)]

        for i in range(0, len(trust)):
            hasTrusted[trust[i][0]] = True
            beTrusted[trust[i][1]] += 1
        
        for i in range(1, n + 1):
            if(not hasTrusted[i] and beTrusted[i] == n - 1):
                return i
        return -1