#Alpha-Hill Pattern
def printTriangle(N):
    for x in range(1, N+1):
        for m in range(N-x):
            print(' ', end = '')
        for y in range(x):
            print(chr(65+y), end = '')
        for z in range(x-2, -1, -1):
            print(chr(65+z), end = '')
        print()
    return
printTriangle(3)