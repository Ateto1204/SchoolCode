#include <stdio.h>
#include <stdbool.h>
#define N 1005

char arr[N][N];
int way[8][2] = {{1, 0}, {1, 1}, {0, 1}, {-1, 1},   
                 {-1, 0}, {-1, -1}, {0, -1}, {1, -1}};
int t, n, ans;

// 判斷該格是否臨海
bool check(int x, int y) {
	if(arr[x][y] == '0') return false;
	for(int i=0; i<8; i++) {
		int nx = x + way[i][0];
		int ny = y + way[i][1];
		if(nx>=0 && nx<n && ny>=0 && ny<n) {
			if(arr[nx][ny] == '0') return false;
		} else return false;
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
				if(check(i, j)) ans++;
			}
		}
		printf("%d\n", ans);
	}
}
