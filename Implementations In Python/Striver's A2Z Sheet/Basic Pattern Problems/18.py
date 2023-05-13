#Alpha-Triangle Pattern (Question doesn't exist on GFG)
def printTriangle(N):
    for i in range(N):
        for x in range(i+1):
            print(chr(64+N-i+x), end = ' ')
        print()
    return
printTriangle(3)