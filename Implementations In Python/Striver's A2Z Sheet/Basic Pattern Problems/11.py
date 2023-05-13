#Binary Number Triangle Pattern

#Method 1; Time Complexity; O(N^3) cause concatenation here takes O(n^2)
def convert(a): #a has to be in the form of string
    m = ''
    for x in a:
        if x == '0':
            m += '1'
        else:
            m += '0'
    m += '1'
    return m

def printTriangle(N):
    y = '1'
    print(y)
    i = 0
    while i < N-1:
        a = convert(y)
        y = a
        for x in a:
            print(x, end = ' ')
        print()
        i += 1
    return

#Method 2; Time Complexity of O(n^2)

def printTriangle2(N):
    for x in range(N):
        if x%2 == 0:
            start = 1
        else:
            start = 0
        for y in range(x+1):
            print(start, end = ' ')
            start = 1 - start
        print()
    return
printTriangle2(3)