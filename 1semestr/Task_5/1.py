# -- coding: utf-8 --
def F():
    n=int(input())
    for i in range(n + 1):
        if i ** 2 >= n:
            break
        print(i ** 2)
F()

