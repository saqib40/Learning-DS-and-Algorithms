# GFG problem

# TC is O(Log X) the base of log being 2 and SC is O(1)
def task(X): #32 bit
    # Getting binary of N
    list = [0] * 32
    i = 0
    rem = 0
    while X != 0:
        rem = X % 2
        list[31 - i] = rem
        X //= 2
        i += 1
        
    # Reversing the binary list
    reversedArray = [0] * 32
    k = 31
    while k >= 0:
        reversedArray[31-k] = list[k]
        k -= 1
    
    #converting reversed binary to decimal
    result = 0
    m = 0
    while m < 32:
        result += reversedArray[31-m] * 2**m
        m += 1
    return result


# Leetcode problem