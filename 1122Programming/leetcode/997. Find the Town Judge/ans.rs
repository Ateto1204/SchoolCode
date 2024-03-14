/*
 *
 * https://leetcode.com/problems/find-the-town-judge/
 * Problem ID: 997. Find the Town Judge
 * 
 * Author: revival0728
 * 
 */

impl Solution {
    pub fn find_judge(n: i32, trust: Vec<Vec<i32>>) -> i32 {
        let n = n as usize;
        let mut in_deg = vec![0_usize; n + 1];
        let mut out_deg = vec![0_usize; n + 1];
        for label in trust.iter() {
            let a = label[0] as usize;
            let b = label[1] as usize;
            in_deg[b] += 1;
            out_deg[a] += 1;
        }
        for i in 1..n+1 {
            if in_deg[i] == n - 1 && out_deg[i] == 0 {
                return i as i32;
            }
        }
        return -1;
    }
}
