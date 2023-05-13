#Symmetric-Void Pattern
def printTriangle(N):
    #upper part
    for i in range(N, 0, -1):
        for x in range(i):
            print('*', end = '')
        for y in range(2*N-2*i):
            print(' ', end = '')
        for x in range(i):
            print('*', end = '')
        print()
    #lower part
    for i in range(1, N+1):
        for x in range(i):
            print('*', end = '')
        for y in range(2*N-2*i):
            print(' ', end = '')
        for x in range(i):
            print('*', end = '')
        print()
    return
printTriangle(3)