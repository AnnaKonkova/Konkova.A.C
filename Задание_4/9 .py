# -- coding: utf-8 --
n = int(input('n='))
fib = [1,1]
for i in range(2, n):
    fib.append(fib[-1] + fib[-2]) # adding the following numbers to the array
print(' '.join(str(j) for j in fib)) # we turn all numbers into a string







