# -- coding: utf-8 --
def FindTwins(n):
    print([[i, i + 2] for i in range(n, 2 * n - 1)])


FindTwins(int(input()))
