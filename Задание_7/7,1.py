# -- coding: utf-8 --
mass = []
n = int(input())
for i in range(n):
    mass.append(int(input()))
klk = mass[0]
for i in range(len(mass)):
    if mass[i] % 2 == 0 and mass[i] > klk:
        klk = int(mass[i])
        print(klk)



