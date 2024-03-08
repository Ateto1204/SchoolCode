/*
 *
 * https://hackmd.io/@Ateto/HktKZPd6T
 * 
 * Author: Ateto
 * 
 */

#include <bits/stdc++.h>
#define x first
#define y second
using namespace std;
#define int long long

vector<pair<int, int>> vec;
int n, m, t, ans, a, b;

bool check(int a, int b) {
	if(abs(vec[a].x - vec[b].x) >= 3) return false;
	if(abs(vec[a].y - vec[b].y) >= 3) return false;
	return true;
}

signed main() {
	cin >> n >> m >> t;
	for(int i=0; i<t; i++) {
		cin >> a >> b;
		vec.push_back({a, b});
	}
	sort(vec.begin(), vec.end());
	for(int i=0; i<t; i++) {
		while(check(i, i+1)) {
			i++;
		}
		ans++;
	}
	cout << ans << '\n';
}