# -- coding: utf-8 --
steps = int(input('steps ='))
if steps <= 9:
    for i in range(1,steps+1):
        for j in range(1,i + 1):
            print(j, end=' ')
        print()
