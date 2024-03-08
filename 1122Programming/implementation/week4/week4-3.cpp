/*
 *
 * https://domen111.github.io/UVa-Easy-Viewer/?392
 * 
 * Author: Ateto
 * 
 */

#include <bits/stdc++.h>
using namespace std;

int arr[10];
bool first, flag;

signed main() {
	while(cin >> arr[8]) {
		for(int i=7; i>=0; i--) {
			cin >> arr[i];
		}
		first = true;
		flag = true;
		for(int i=9; i>=0; i--) {
			if(arr[i] == 0) continue;
			flag = false;
			if(arr[i] < 0) {
				if(first) {
					first = false;
					if(arr[i] == -1 && i != 0) cout << '-';
					else if(arr[i] == -1) cout << "-1";
					else cout << arr[i];
 				} else {
 					cout << " - ";
 					if(arr[i] != -1 || i == 0) cout << -arr[i];
 				}
			} else {
				if(first) {
					first = false;
					if(arr[i] != 1 || i == 0) cout << arr[i];
				} else {
					cout << " + ";
					if(arr[i] != 1 || i == 0) cout << arr[i];
				}
			}
			if(i != 0 && i != 1) cout << "x^" << i;
			else if(i == 1) cout << "x";
		}
		if(flag) cout << 0;
		cout << '\n';
	}
}