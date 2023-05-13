#Hollow Rectangle Pattern
def printTriangle(N):
    for x in range(1, N+1):
        if x == 1:
            for y in range(N):
                print('*', end = '')
        elif x == N:
            for m in range(N):
                print('*', end = '')
        else:
            print('*', end = '')
            for z in range(N-2):
                print(' ', end = '')
            print('*', end = '')
        print()
    return
printTriangle(4)