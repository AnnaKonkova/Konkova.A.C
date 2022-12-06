# -- coding: utf-8 --
def F(col):
    sum_fact = 0
    fact = 1
    for i in range(1, col + 1):
        fact *= i
        sum_fact += fact
    print(sum_fact)
F(4)