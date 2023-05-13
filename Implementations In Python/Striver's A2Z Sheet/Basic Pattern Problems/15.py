#Reverse Letter Triangle Pattern
def printTriangle(N):
    for x in range(N, 0, -1):
        for y in range(x):
            print(chr(65+y), end = '')
        print()
    return

printTriangle(3)