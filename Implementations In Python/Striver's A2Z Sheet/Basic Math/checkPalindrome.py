# Method 1
# Problem being concatenation which has a TC of O(N^2)
def checkPalindrome1(n):
    n = str(n)
    k = len(n) - 1
    answer = ''
    while k >= 0:
        answer += n[k]
        k -= 1
    if answer == n:
        return 'Yes'
    else:
        return 'No'

# Method 2
def checkPalindrome2(n):
    temp = n
    reverse = 0
    i = len(str(n)) - 1 #this is a time consuming operation
    while temp != 0:
        lastDigit = temp % 10
        reverse += lastDigit * 10**i
        temp //= 10
        i -= 1
    if n == reverse:
        return 'Yes'
    else:
        return 'No'

# Method 3; TC is O(n), n being length of number and SC is O(1)
def checkPalindrome3(n):
    temp = n
    reverse = 0
    while temp != 0:
        lastDigit = temp % 10
        reverse = reverse * 10 + lastDigit
        temp //= 10
    if n == reverse:
        return 'Yes'
    else:
        return 'No'