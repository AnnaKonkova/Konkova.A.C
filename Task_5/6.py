# -- coding: utf-8 --
count=0
summ=0
while True:
    x=int(input())
    if x==0:
        break
    count+=x
    summ+=1
print(count/summ)
