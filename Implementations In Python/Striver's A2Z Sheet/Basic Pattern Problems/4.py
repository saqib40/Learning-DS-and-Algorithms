#Right-Angled Number Pyramid – II
def printTriangle(N):
        # Code here
        for x in range(1, N+1):
            for y in range(x):
                print(x, end = ' ')
            print()
        return

printTriangle(5)