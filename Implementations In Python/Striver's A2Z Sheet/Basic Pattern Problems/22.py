#The Number Pattern
#Solution isn't that intuitive, for that you can check striver's youtube

def printTriangle(N):
    for i in range(2*N-1):
        for j in range(2*N-1):
            top = i
            left = j
            right = (2*N - 2) - j
            bottom = (2*N - 2) - i
            
            #minimum distance of an element from any edge
            minD = min(top, left, right, bottom)
            
            print(N-minD, end = ' ')
        print()
    return

printTriangle(3)