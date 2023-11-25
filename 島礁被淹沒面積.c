#include <stdio.h>
#include <stdbool.h>
#define N 1005

char arr[N][N];
int way[8][2] = {{1, 0}, {1, 1}, {0, 1}, {-1, 1},   
                 {-1, 0}, {-1, -1}, {0, -1}, {1, -1}};
int t, n, ans;

bool check(int x, int y) {
	if(x-1 >= 0 && x+1 < n && y-1 >= 0 && y+1 < n) {
		for(int i=0; i<8; i++) {
			if(arr[x+way[i][0]][y+way[i][1]] == '0') return true;
		}
		return false;
	}
	return true;
}

int main() {
	scanf("%d", &t);
	while(t--) {
		scanf("%d", &n);
		for(int i=0; i<n; i++) {
			scanf("%s", arr[i]);
		}
		ans = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] == '1' && check(i, j)) arr[i][j] = '2';
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] == '1') ans++;
			}
		}
		printf("%d\n", ans);
	}
}
