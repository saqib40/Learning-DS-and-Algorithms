# To check if n is prime or not

# Method 1; Iterate from 2 to n-1
# Method 2; Iterate from 2 to n//2

# Method 3; Iterate from 2 to isqrt(n); the co-factor logic
from math import *
def isPrime(n):
    for x in range(2, isqrt(n)+1):
        if n % x == 0:
            return False
    return True

# To find all prime numbers upto n

# Method 1; Brute Force
def allPrimes(n):
    for x in range(2, n+1):
        if isPrime(x):
            print(x)
    return

# Method 2; Sieve Of Erathosthenes; It's TC is O(nLogLogn)
def allPrimes2(n):
    primes = [1] * (n+1) # TC of this part will be neglected as it's usually done
    primes[0] = 0
    primes[1] = 0
    for i in range(2, isqrt(n)+1): # sqrt is optimaxtion over n
        if primes[i] == 1:
            j = 2
            while i*j <= n:
                primes[i*j] = 0
                j += 1
    #to print, it's TC also will be neglected for the same reason
    i = 0
    while i <= n:
        if primes[i] == 1:
            print(i)
        i += 1
    return

# Prime Factorisation

# Worst case is when n is prime; then TC will be O(n)
# Else TC will be Logarithmic
def pFact(n):
    for i in range(2, n+1): # or till n//2 + 1
        if n % i == 0:
            count = 0
            while n%i == 0:
                n = n/i
                count += 1
            print(i, '^', count)
    return

# Optimising it; Logic is to get out of loop once we encounter the prime number
# Here in worst cases TC will be O(sqrt(n))
# Else TC will be Logarithmic but still faster than previous one
def pFact2(n):
    for i in range(2, isqrt(n) + 1):
        if n % i == 0:
            count = 0
            while n%i == 0:
                n = n/i
                count += 1
            print(i, '^', count)
    if n != 1:
        print(n, '^', count)
    return