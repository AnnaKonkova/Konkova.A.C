# -- coding: utf-8 --
first=int(input())
second=int(input())
third=int(input())
if (first==second) and (second==third):
    print(3)
elif (first==second) and (second!=third) or(first!=second) and (second==third):
    print(2)
else:
    print(0)

