# -- coding: utf-8 --
def F(n):
    sum = 0
    for i in range(n):
        sum += i ** 3
        print(sum)
F(5)