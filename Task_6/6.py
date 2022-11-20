# -- coding: utf-8 --
s = 'jmn нн. шннннн. оош ннн...'
print('s =', s.replace('.', '!'))
count = 0
max_count = 0
for i in s:
    if i == 'н':
        count += 1
        max_count = max(count, max_count)
    else:
        count = 0
print(max_count)


