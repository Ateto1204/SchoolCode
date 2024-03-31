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
        ListNode* quick = head;
        ListNode* slow = head;
        while(slow->next && quick->next) {
            slow = slow->next;
            quick = quick->next;
            if(quick->next) {
                quick = quick->next;
            }
        }
        return slow;
    }
};