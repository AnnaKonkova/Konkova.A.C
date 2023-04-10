# -- coding: utf-8 --
def F(a, b):
    if a <= b:
        for i in range(a, b + 1):
            print(i)
    else:
        print(' a should be less b ')


F(3, 8)
