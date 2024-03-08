/*
 *
 * https://hackmd.io/@Ateto/By1qgwup6
 * 
 * Author: Ateto
 * 
 */

#include <bits/stdc++.h>
using namespace std;

struct ListNode {
	string val;
	ListNode* next;
};

void add(ListNode* head, string val) {
	ListNode* node = new ListNode;
	node->next = NULL;
	node->val = val;
	while(head->next) {
		head = head->next;
	}
	head->next = node;
}

void insert(ListNode* head, string val, string pos) {
	ListNode* node = new ListNode;
	node->val = val;
	while(head->next && head->next->val != pos) {
		head = head->next;
	}
	node->next = head->next;
	head->next = node;
}

void remove(ListNode* head, string pos) {
	while(head->next->val != pos) {
		head = head->next;
	}
	head->next = head->next->next;
}


signed main() {
	ListNode* head = new ListNode;
	head->next = NULL;
	string s, val, pos;
	while(cin >> s) {
		if(s == "SHOW") break;
		if(s == "ADD") {
			cin >> val;
			add(head, val);
		} else if(s == "INSERT") {
			cin >> val >> pos;
			insert(head, val, pos);
		} else if(s == "REMOVE") {
			cin >> pos;
			remove(head, pos);
		}
	}
	while(head->next) {
		head = head->next;
		cout << head->val << ' ';
	}
	cout << '\n';
}

