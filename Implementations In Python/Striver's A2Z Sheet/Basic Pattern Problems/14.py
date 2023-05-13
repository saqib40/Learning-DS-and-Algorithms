#Increasing Letter Triangle Pattern
def printTriangle(N):
    for i in range(1, N+1):
        for y in range(i):
            print(chr(65+y), end = '')
        print()
    return

printTriangle(3)