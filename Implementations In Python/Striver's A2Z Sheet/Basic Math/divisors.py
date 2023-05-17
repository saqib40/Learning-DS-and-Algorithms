# Method 1; math module isn't accepted in GFG
import math
def sumOfDivisors(N):
    result = 1
    for x in range(2, N+1):
        for y in range(1, math.isqrt(x)+1):
            if x % y == 0:
                result += y
                if y != math.sqrt(x):
                    result += x/y
    return result

# Another way for same; without using math module; TLE
def sumOfDivisors2(N):
    result = 1
    for x in range(2, N+1):
        for y in range(1, int(x ** (1/2))+1):
            if x % y == 0:
                result += y
                if y != x ** (1/2):
                    result += x/y
    return result

# Method 2; TLE
def sumOfDivisors3(N):
    result = 1
    for i in range(2, N+1):
        answer = i
        for x in range(1, i//2 + 1):
            if i % x == 0:
                answer += x
        result += answer
    return result

# Method 3; Worked
# We are working with multiples here
def sumOfDivisors3(N):
    result = 0
    for i in range(1, N+1):
        result += N//i * i #Interestingly I learned that N//i is much time effective than int(N/i)
    return result
