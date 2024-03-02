/*
 *
 * https://leetcode.com/problems/find-the-town-judge/
 * Problem ID: 997. Find the Town Judge
 * 
 * Author: Ateto
 * 
 */

class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
        const int N = 1005;
        bool hasTrusted[N];
        int beTrusted[N];

        for(int i=0; i<trust.size(); i++) {
            hasTrusted[trust[i][0]] = true;
            beTrusted[trust[i][1]] ++;
        }

        for(int i=1; i<=n; i++) {
            if(!hasTrusted[i] && beTrusted[i]==n-1) return i;
        }
        return -1;
    }
};