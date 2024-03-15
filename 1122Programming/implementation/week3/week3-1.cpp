#include <bits/stdc++.h>
using namespace std;

string s;
int sum;

signed main() {
	while(cin >> s) {
		sum = 0;
		for(int i=0, j=1; i<s.size(); i++) {
			if(s[i] == '-') continue;
			if(j > 9) break;
			sum += (s[i] - '0') * j;
			j++;
		}
		sum %= 11;
		if(s[s.size() - 1] - '0' == 'X' && sum == 10) {
			cout << "OK\n";
		} else if(s[s.size() - 1] - '0' == sum) {
			cout << "OK\n";
		} else {
			for(int i=0; i<s.size() - 1; i++) {
				cout << s[i];
			}
			if(sum == 10) cout << "X\n";
			else cout << sum << '\n';
		}
	}
}