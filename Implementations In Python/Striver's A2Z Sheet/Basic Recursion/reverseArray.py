# Using another array
def reverse(myArr):
  n = len(myArr)
  reversedArray = [0] * n
  i = n
  while i > 0:
    reversedArray[n - i] = myArr[i - 1]
    i -= 1
  return reversedArray


# Without using another array; it's space effective
def reverse2(myArr):
  n = len(myArr)
  i = 1
  while i < n // 2 + 1:
    temp1 = myArr[i - 1]
    temp2 = myArr[n - i]
    myArr[i - 1] = temp2
    myArr[n - i] = temp1
    i += 1
  return myArr


# Using recursion
def reverse3(myArr, n, i=0):  # n represents end index
  if i < n:
    a = myArr[n]
    b = myArr[i]
    myArr[n] = b
    myArr[i] = a
    reverse3(myArr, n - 1, i + 1)
  return myArr
