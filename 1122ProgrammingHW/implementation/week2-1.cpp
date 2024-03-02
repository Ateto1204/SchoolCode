#include <iostream>
#include <iomanip>
using namespace std;

int n;
double k;

signed main() {
	cin >> n;
	while(n--) {
		cin >> k;
		cout << fixed << setprecision(2) << k*3.306 << ' ' << k*3.95 << '\n';
	}
}