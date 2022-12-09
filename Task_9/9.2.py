# -- coding: utf-8 --
from random import randint
def F():
    str_mat = 3#int(input('введите для первой матрицы количество строк : '))
    stolb_mat = 4 #int(input('количество столбцов : '))
    matrix = [[randint(0,10) for j in range(stolb_mat)]for i in range(str_mat)]

    len_stlb = len(matrix)
    len_str = len(matrix[0])
    max_el_matr = abs(matrix[0][0])
    for row in matrix:
        for el in row:
            max_el_matr = max(abs(el), max_el_matr)

    tmp = pow(max_el_matr + 1, len_stlb) # tmp - это максимальное возможное произведение элементов, которое может быть у столбцов
    c = [1] * len_str
    for i in range(len_stlb):
        print(*map('{:2d}'.format, matrix[i]))
        for j in range(len_str):
            if abs(matrix[i][j]) < 10 and abs(c[j]) < tmp:
                c[j] *= matrix[i][j]
            else:
                c[j] = tmp
    print('произведение элементов столбцов ')
    print(c)
    print()

    if min(c) < tmp:
        ind = c.index(min(c))
        print('столбец с миним произв: ', ind + 1)
        ind = len_str - 2 if ind == len_str - 1 else ind
        for i in range(len_stlb):
            for j in range(len_str):
                matrix[i][ind], matrix[i][ind - 1] = matrix[i][ind - 1], matrix[i][ind]
            print(*map('{:2d}'.format, matrix[i]))
    else:
        print('столбцов, удовлетворяющих условию задания нет')

F()