# -- coding: utf-8 --
col = int(input('enter col='))
cum_fact = 0
fact = 1
for i in range(1, col + 1):
    fact *= i
    cum_fact += fact
print(cum_fact)
