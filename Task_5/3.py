# -- coding: utf-8 --
def max_pow():
    n = int(input())
    c = 0
    while n > 1:
        n = n // 2
        c += 1
    t = 1
    for i in range(c):
        t *= 2
    print(c, t)
max_pow()

