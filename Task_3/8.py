# -- coding: utf-8 --
def count_equal(second,third,first):
    if (first==second) and (second==third):
        print(3)
    elif (first==second) and (second!=third) or(first!=second) and (second==third):
        print(2)
    else:
        print(0)

count_equal(4,2,4)