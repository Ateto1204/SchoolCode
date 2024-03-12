/*
 *
 * https://leetcode.com/problems/find-the-town-judge/
 * Problem ID: 997. Find the Town Judge
 * 
 * Author: asd7766zxc
 * 
 */

public class Solution {
    public int FindJudge(int n, int[][] trust) {
        return Enumerable.Range(1, n).Where((x, i) => trust.Where((arr) => arr[1] == x).Distinct().Count() == n - 1 && trust.Where((arr) => arr[0] == x).Count() == 0).FirstOrDefault(-1);
    }
}