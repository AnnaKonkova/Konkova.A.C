# -- coding: utf-8 --
def Del(n):
    if (n % 4 == 0) and (n % 100 != 0) or (n % 400 == 0):
        print('Да')
    else:
        print('Нет')


Del(8040)
