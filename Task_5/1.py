# -- coding: utf-8 --
n = int(input())
for i in range(n + 1):
    if i ** 2 >= n:
        break
    print(i ** 2)
