# -- coding: utf-8 --
def F():
    n = int(input())
    if n > 0:
        if n % 2:
            print('-', n)
            F()
        else:
            F()


F()

