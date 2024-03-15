#include <bits/stdc++.h>
using namespace std;
#define FASTIO ios::sync_with_stdio(0), cin.tie(0), cout.tie(0)
#define int long long

double fpow(double x, int n) {
    double res = 1;
    for (; n; x *= x, n >>= 1)
        if (n & 1)
            res = res * x;
    return res;
}
void solve() {
    int n, x;
    double p;
    cin >> n >> p >> x;
    // cout << n << ' ' << p << ' ' << x << '\n';
    double a1 = p * fpow(1 - p, x - 1);
    double r = fpow(1 - p, n);
    // cout << a1 << ' ' << r << '\n';
    double ans = a1 / (1 - r);
    cout << fixed << setprecision(4) << ans << '\n';
}
signed main() {
    FASTIO;
    int n;
    cin >> n;
    while (n--)
        solve();
}