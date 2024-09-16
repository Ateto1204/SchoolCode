'''
- Problem: 計算C(m,n)
- Date: 2024-09-16
- Author: Ateto
'''

import math

def getInt() -> int: 
    return int(input())

def solve(m: int, n: int) -> int:
    res: int = math.factorial(m) // (math.factorial(n) * math.factorial(m - n))
    return res

def main():
    m: int = getInt()
    n: int = getInt()
    res: int = solve(m, n)
    print(res)

main()