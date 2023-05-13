#Half Diamond Star Pattern
def printTriangle(N):
    #upper part
    for x in range(1, N+1):
            for y in range(x):
                print('* ', end = '')
            print()
    #lower part
    for x in range(N-1, 0, -1):
            for y in range(x):
                print('*', end = ' ')
            print()
    return