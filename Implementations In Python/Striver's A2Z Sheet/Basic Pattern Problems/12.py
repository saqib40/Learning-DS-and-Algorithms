#Number Crown Pattern
def printTriangle(N):
    for i in range(1, N+1):
        for x in range(1, i+1):
            print(x, end = ' ')
        for y in range(4*N - 4*i):
            print(' ', end = '')
        for z in range(i, 0, -1):
            print(z, end = ' ')
        print()
    return

printTriangle(5)