# GCD
# Method 1;
def gcd1(a,b):
    smaller = b if a >= b else a
    if a % smaller == 0 and b % smaller == 0:
        return smaller
    i = smaller//2
    while i > 0:
        if a%i == 0 and b%i == 0:
                return i
        else:
            i -= 1

# Method 2; 
# Using Euclid's algorithm (iterative way)
def gcd2(a,b):
    divisor, dividend = a, b
    while divisor != 0:
        remainder = dividend % divisor
        dividend = divisor
        divisor = remainder
    return dividend

# Using Euclid's algorithm (recursive way)
def gcd3(A,B):
    dividend, divisor = A, B
    if divisor == 0:
        return dividend
    else:
        return gcd3(divisor, dividend % divisor)

#LCM
def lcm(a,b):
    larger = b if b >= a else a
    i = larger
    while True:
        if i % b == 0 and i % a == 0:
            return i
        i += 1


#problem
def lcmAndGcd(A,B):
    result = [0] * 2
    #GCD
    divisor, dividend = A, B
    while divisor != 0:
        remainder = dividend % divisor
        dividend = divisor
        divisor = remainder
    result[1] = dividend
    #LCM
    result[0] = (A*B)//result[1] #cause LCM * GCD = A * B
    return result