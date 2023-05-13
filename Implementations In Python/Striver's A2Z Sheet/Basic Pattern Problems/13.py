#Increasing Number Triangle Pattern
def printTriangle(N):
    temp = 1
    for i in range(1, N+1):
        for x in range(i):
            print(temp, end = ' ')
            temp += 1
        print()
    return
printTriangle(3)