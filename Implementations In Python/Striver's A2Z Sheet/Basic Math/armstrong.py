# GFG
def armstrongNumber(n):
    temp = n
    a = (n%10) ** 3
    n = n//10
    b = (n%10) ** 3
    n = n//10
    c = (n%10) ** 3
    sum = a + b + c
    return 'Yes' if sum == temp else 'No'

# General armstrong number
def asN(n):
    compConstant = n
    # Let's count the number of digits
    temp = n
    count = 0
    while temp != 0:
        temp //= 10
        count += 1
    # Now let's check
    sum = 0
    while n != 0:
        rem = n % 10
        sum += rem ** count
        n //= 10
    return 'Yes' if sum == compConstant else 'No'