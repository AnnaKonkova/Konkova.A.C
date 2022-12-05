# -- coding: utf-8 --
def choc(k,m,n):
    if k < m*n and (k%m==0 or k%n==0):
        print('YES')
    else:
        print('NO')
choc(7,3,4)