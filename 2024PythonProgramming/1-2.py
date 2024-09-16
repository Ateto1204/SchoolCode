'''
- Problem: 計算本利和
- Date: 2024-09-16
- Author: Ateto
'''

import decimal

def getDecimal(msg: str) -> decimal.Decimal:
    return decimal.Decimal(input(msg))

def solve(m: decimal.Decimal, 
          r: decimal.Decimal, 
          y: decimal.Decimal,) -> decimal.Decimal:
    return m * (1+r) ** y

def main():
    m = getDecimal('本金:')
    r = getDecimal('利率:')
    y = getDecimal('存幾年:')

    res = solve(m, r, y)
    print('本利和', res, sep=':')

main()