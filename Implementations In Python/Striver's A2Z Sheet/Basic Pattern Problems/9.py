#Diamond Star Pattern

#Question 1 from striver
def printDiamond1(N):
    #printing upper part
    for i in range(1, N+1):
        for x in range(N - i):
            print(' ', end = '')
        for y in range(2*i - 1):
            print('*', end = '')
        print()
    #printing lower part
    a = 2*N -1
    for i in range(1, N+1):
        for y in range(i-1):
            print(' ', end = '')
        for x in range(a + (i-1) * (-2)):
            print('*', end = '')
        print()
    return

#Question 2 from GFG (almost similar with a very slight difference)
def printTriangle(N):
    #printing upper part
    for x in range(1, N+1):
        for m in range(N-x):
            print(' ', end = '')
        for y in range(x):
            print('* ', end = '')
        print()
    #printing lower part
    for x in range(N, 0, -1):
        for m in range(N-x):
            print(' ', end = '')
        for y in range(x):
            print('*', end = ' ')
        print()
    return