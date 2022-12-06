# -- coding: utf-8 --
def F(a, b):
    if a>b:
        for i in range(a, b-1 ,-1):
            if i%2!=0:
                print(i)
    else:
        print(' a should be less b ')
F(9, 2)