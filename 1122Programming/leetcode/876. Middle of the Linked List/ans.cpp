/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * Problem ID: 876. Middle of the Linked List
 *
 * Author: Ateto
 *
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
    ListNode* middleNode(ListNode* head) {
        ListNode* dummy = head;
        int n = 0;
        while(dummy != NULL) {
            dummy = dummy->next;
            n++;
        }
        for(int i = 0; i < n/2; i++) {
            head = head->next;
        }
        return head;
    }
};