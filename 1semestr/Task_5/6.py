# -- coding: utf-8 --
def middle():
    count = 0
    summ = 0
    while True:
        x = int(input())
        if x == 0:
            break
        summ += x
        count += 1
    print(summ / count)


middle()
