#GFG's Problem

# Method 1; SC is O(1) & Time Complexity is ??
# only problem here is that it's hard to find time complexity cause
# we are using in-built int()
def countDigits1(N):
    a = str(N)
    result = 0
    for x in a:
        if x != '0' and N % int(x) == 0:
            result += 1
    return result

#Method 2; SC is O(1) & Time Complexity is O(log N)
# Underlying Concept;
# 1. You get the last digit of a number N by doing mod 10 of N
# 2. You get the number without last digit by doing floor division by 10
def countDigits2(N):
    temp = N
    result = 0
    while temp != 0:
        d = temp % 10
        if d != 0 and N % d == 0:
            result += 1
        temp //= 10
    return result

#Striver's Problem