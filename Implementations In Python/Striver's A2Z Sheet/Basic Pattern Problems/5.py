#Inverted Right Pyramid
def printTriangle(N):
        for x in range(N, 0, -1):
            for y in range(x):
                print('*', end = ' ')
            print()
        return

printTriangle(5)