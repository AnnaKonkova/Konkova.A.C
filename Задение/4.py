# -- coding: utf-8 --

#№4
seconds=int(input())
day= seconds//(24*3600)
seconds%=(24*3600)
hour=seconds//3600
minutes=seconds%3600//60
seconds%=60
print( day,':',hour,':',minutes,':',seconds)

