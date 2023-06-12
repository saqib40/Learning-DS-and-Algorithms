# Method 1; TC is O(N) & SC is O(N)
def moveZeroes(A, n):
  myArray = [0] * n
  j = 0
  for i in range(0, n):
    if A[i] != 0:
      myArray[j] = A[i]
      j += 1
  return myArray


# Method 2; TC is O(N^2) & SC is O(1)
def moveZeroes2(A, n):
  for i in range(0, n):
    if A[i] == 0:
      for j in range(i + 1, n):
        if A[j] != 0:
          temp = A[i]
          A[i] = A[j]
          A[j] = temp
          break
  return A


# Method 3; TC is O(N) & SC is O(1)
def moveZeroes3(A, n):
  i = 0
  while i < n and A[i] != 0:
    i += 1
  j = i + 1
  while j < n:
    if A[j] == 0:
      j += 1
    else:
      temp = A[j]
      A[j] = A[i]
      A[i] = temp
      j += 1
      i += 1
  return A
