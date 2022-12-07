# -- coding: utf-8 --
def mass_even_numb():
    mass = []
    n = int(input('Введите колличкство элементов в массиве '))
    for i in range(n):
        mass.append(int(input('Введите элемент ')))
    diff_mass = []
    for i in mass:
        if i % 2 == 0 and i < 10:
            diff_mass.append(i)
    if len(diff_mass) == 0:
        print("Четных чисел в данном массиве нет.")
    else:
        print(sorted(diff_mass))
mass_even_numb()