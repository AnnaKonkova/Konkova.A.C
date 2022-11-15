# -- coding: utf-8 --

def main(n):
    for i in range(2,int((n**0.5)+1)):
        if n%i==0:
            return(False)
        else:
            return (True)
def Blizn(n):
    return main(n) and main(n-2) or main(n+2)

n = int(input())
print(*filter(Blizn, [x for x in range(n, 2*n+1)]))