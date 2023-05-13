#Star Pyramid
def printTriangle(N):
    for i in range(1, N+1):
        for x in range(N - i):
            print(' ', end = '')
        for y in range(2*i - 1):
            print('*', end = '')
        print()
    return

printTriangle(3)