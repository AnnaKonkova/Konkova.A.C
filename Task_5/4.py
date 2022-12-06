# -- coding: utf-8 --
def Number_day():
    x = int(input('В первый день спортсмен пробежал x километров  x='))
    y = int(input('номер дня, на который пробег спортсмена составит не менее y километров  y= '))
    day = 1
    while x < y:
        x *= 1.1
        day += 1
    print(day)


Number_day()
