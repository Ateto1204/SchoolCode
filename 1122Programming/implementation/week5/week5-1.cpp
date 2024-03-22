#include <bits/stdc++.h>
#define N 100005
using namespace std;

int arr[N], n;

signed main() {
	ios::sync_with_stdio(0), cin.tie(0);
	while(cin >> n) {
		if(n == 0) break;
		for(int i = 0; i < n; i++) {
			cin >> arr[i];
		}
		int p = 0, q = n - 1;
		int a = 0, b = 0, i = 0;
		while(q > p) {
			if(q-1 > p && arr[q-1] > arr[q]) {
				if(i % 2 == 0) a += arr[p];
				else b += arr[p];
				p++;
			} else if(p+1 < q && arr[p] < arr[p+1]) {
				if(i % 2 == 0) a += arr[q];
				else b += arr[q];
				q--;
			} else if(arr[p] > arr[q]) {
				if(i % 2 == 0) a += arr[p];
				else b += arr[p];
				p++;
			} else {
				if(i % 2 == 0) a += arr[q];
				else b += arr[q];
				q--;
			}
			i++;
		}
		if(a >= b) cout << "WIN\n";
		else cout << "LOSE\n";
	}
}