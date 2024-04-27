/**
 * https://leetcode.com/problems/find-the-pivot-integer/
 * Problem ID: 2485. Find the Pivot Integer
 *
 * Author: Ateto
 */

class Solution {
    func sum(p: Int, q: Int) -> Int {
        let tmp: Int = ((p + q) * (q - p + 1)) >> 1
        return tmp
    }
    func pivotInteger(_ n: Int) -> Int {
        var left: Int = 1
        var right: Int = n
        while left <= right {
            let mid: Int = (left + right) >> 1
            let x: Int = sum(p: 1, q: mid)
            let y: Int = sum(p: mid, q: n)
            if x == y {
                return mid
            }
            if x < y {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return -1
    }
}