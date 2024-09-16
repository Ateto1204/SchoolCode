'''
- Problem: 計算共有多少輸入數字
- Date: 2024-09-16
- Author: Ateto
'''

def solve() -> int:
    offer: list = input().split(',')
    res = sum(1 for item in offer if item.isdigit())
    return res

def main():
    res: int = solve()
    print(res)

main()