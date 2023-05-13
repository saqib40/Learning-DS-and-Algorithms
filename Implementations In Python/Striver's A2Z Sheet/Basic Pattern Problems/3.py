#Right-Angled Number Pyramid
def printTriangle(N):
        for x in range(1, N+1):
            for y in range(1, x+1):
                print(y, end = ' ')
            print()
        return

printTriangle(5)