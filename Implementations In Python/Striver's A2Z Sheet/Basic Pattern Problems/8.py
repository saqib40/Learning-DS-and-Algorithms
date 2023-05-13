#Inverted Star Pyramid
def printTriangle(N):
    a = 2*N -1
    for i in range(1, N+1):
        for y in range(i-1):
            print(' ', end = '')
        for x in range(a + (i-1) * (-2)):
            print('*', end = '')
        print()
    return

printTriangle(3)