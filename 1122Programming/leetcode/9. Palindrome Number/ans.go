/*
 *
 * https://leetcode.com/problems/palindrome-number/
 * Problem ID: 9. Palindrome Number
 * 
 * Author: GU_7
 * 
 */
func isPalindrome(x int) bool {
    if x < 0 {
        return false
    }
    arr := []int{}
    for x != 0 {
        arr = append(arr, x % 10)
        x = x / 10
    }
    n := len(arr)
    for i := 0; i < n; i++ {
        if(arr[i] != arr[n - 1 - i]) {
            return false
        }
    }
    return true
}