#include <bits/stdc++.h>
#define int long long
#define AC ios::sync_with_stdio(0), cout.tie(0);
using namespace std;

string result;
vector<int> pre, cur;
int n;

signed main() {
	AC 
	while(cin >> n) {
		result = "[[1],[1,1]";
		pre.clear(), cur.clear();
		pre.push_back(1);
		pre.push_back(1);
		if(n <= 0) {
			cout << "[]\n";
			continue;
		}
		if(n == 1) {
			cout << "[[1]]\n";
			continue;
		}
		for(int i = 2; i < n; i++) {
			result.push_back(',');
			result.push_back('[');
			cur.push_back(1);
			for(int j = 0; j < pre.size() - 1; j++) {
				int tmp = pre[j] + pre[j + 1];
				cur.push_back(tmp);
			}
			cur.push_back(1);
			for(int j = 0; j < cur.size(); j++) {
				int tmp = cur[j];
				string str;
				while(tmp > 0) {
					str.push_back('0' + tmp % 10);
					tmp /= 10;
				}
				reverse(str.begin(), str.end());
				result += str;
				if(j + 1 < cur.size()) result.push_back(',');
			}
			result.push_back(']');
			pre = cur;
			cur.clear();
		}
		result.push_back(']');
		cout << result << '\n';
	}
}