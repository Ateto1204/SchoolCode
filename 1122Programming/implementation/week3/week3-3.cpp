#include <bits/stdc++.h>
using namespace std;

string s, cur, nxt;
bool flag;

signed main() {
	ios::sync_with_stdio(0), cin.tie(0);
	while(cin >> s) {
		flag = false;
		for(int ST = 1; ST < 10000; ST++) {
			cur.clear();
			nxt.clear();
			for(int i=0; i<s.size(); i++) {
				int digit = ST + s[i] - 'A';
				string tmp;
				while(digit) {
					tmp.push_back(digit % 10 + '0');
					digit /= 10;
				}
				reverse(tmp.begin(), tmp.end());
				cur += tmp;
			}
			while(cur != "100" && cur.size() > 2) {
				nxt.clear();
				for(int i=0; i<cur.size()-1; i++) {
					int a = cur[i] - '0';
					int b = cur[i+1] - '0';
					nxt.push_back('0' + (a+b)%10);
				}
				cur = nxt;
			}
			if(cur == "100") {
				flag = true;
				cout << ST << '\n';
				break;
			}
		}
		if(!flag) cout << ":(\n";
	}
}