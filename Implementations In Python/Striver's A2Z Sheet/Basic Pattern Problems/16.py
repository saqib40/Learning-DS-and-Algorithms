#Alpha-Ramp Pattern
def printTriangle(N):
    for x in range(1, N+1):
        for y in range(x):
            print(chr(64+x), end = '')
        print()
    return

printTriangle(3)