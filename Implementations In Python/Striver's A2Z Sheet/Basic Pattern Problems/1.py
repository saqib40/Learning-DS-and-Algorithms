#Rectangular (Square) Star Pattern
def printSquare(N):
        for x in range(N):
            for y in range(N):
                print('*', end = ' ') #Some editors give syntax error for end parameter
            print()
        return

printSquare(5)