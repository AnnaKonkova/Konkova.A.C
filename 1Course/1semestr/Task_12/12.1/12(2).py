# -- coding: utf-8 --
x = int(input())
y = int(input())


def remains(x, y):
    if x >= y:
        return remains(x - y, y)
    else:
        return x


print(remains(x, y))
