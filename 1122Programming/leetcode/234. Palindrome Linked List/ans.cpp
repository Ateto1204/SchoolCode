/*
 *
 * https://leetcode.com/problems/palindrome-linked-list
 * Problem ID: 234. Palindrome Linked List
 * 
 * Author: Ateto
 * 
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        vector<int> vec;
        ListNode* dummy = head;
        while(dummy != NULL) {
            vec.push_back(dummy->val);
            dummy = dummy->next;
        }
        int n = vec.size();
        for(int i = 0; i < n; i++) {
            if(vec[i] != vec[n - i - 1]) {
                return false;
            }
        }
        return true;
    }
};