# -- coding: utf-8 --
n=int(input())
if (n%4==0) and(n%400==0) and(n%100!=0):
    print('Да')
else:
    print('Нет')


