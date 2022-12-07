# -- coding: utf-8 --
from random import randint

def summ_el():
    el_1 = int(input('введите для первой матрицы количество строк : '))
    str_1 = int(input('количество элементов в строке : '))
    matrix = [[randint(1, 50) for j in range(str_1)] for i in range(el_1)]
    for row in matrix:
        print(row)

    min_ = [min(row) for row in matrix]
    ind_row_with_min = min_.index(min(min_))
    print(min(min_))

    print('sum: {}'.format(sum(matrix[ind_row_with_min])))


summ_el()
