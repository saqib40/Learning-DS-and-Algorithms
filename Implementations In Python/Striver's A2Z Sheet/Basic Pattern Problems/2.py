#Right-Angled Triangle Pattern
def printTriangle(N):
        for x in range(1, N+1):
            for y in range(x):
                print('* ', end = '')
            print()
        return

printTriangle(2)