#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#define N 25

int arr[N] = {1}, x[N], t, n, idx;
bool used[N], le, ri;

int main() {
	scanf("%d", &t);
	while(t--) {
		scanf("%d", &n);
		for(int i=1; i<=n; i++) {
			scanf("%d%d", &arr[i], &x[i]);
			x[i] %= n;
		}
		memset(used, false, sizeof(used));
		for(int i=1; i<=n; i++) {
			le = ri = false;
			idx = arr[i-1] + x[i];
			if(idx > n) idx -= n;
			while(used[idx]) {
				idx++;
				if(idx > n) idx = 1;
			}
			if(idx == arr[i] && !used[idx]) le = true;
			idx = arr[i-1] - x[i];
			if(idx < 1) idx += n;
			while(used[idx]) {
				idx--;
				if(idx < 1) idx = n;
			}
			if(idx == arr[i] && !used[idx]) ri = true;
			if(le && !ri) printf("%d L\n", i);
			else if(ri && !le) printf("%d R\n", i);
			used[arr[i]] = true;
		}
	}
}