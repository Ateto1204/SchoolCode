#include <iostream>
using namespace std;

int n;

signed main() {
	while(cin >> n) {
		if(n <= 1500) cout << 70 << '\n';
		else {
			int sum = 70;
			n -= 1500;
			int k;
			k = n/500;
			if(n%500 != 0) k++;
			sum += k*5;
			cout << sum << '\n';
		}
	}
}