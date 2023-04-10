# -- coding: utf-8 --
def min_del():
    N = int(input())
    n_2 = N
    b = int(N ** 0.5)
    for i in range(2, b + 1):
        if N % i == 0:
            if n_2 > i:
                n_2 = i
    print(n_2)
min_del()

