# Method 1; TC is O(N) & SC is O(N)
def leftRotate(arr, n, k):
  myArray = [0] * n
  for i in range(k, n):
    myArray[i - k] = arr[i]
  for j in range(0, k):
    myArray[n - k + j] = arr[j]
  return myArray


#Method 2; Using reversal algorithm
def reverseTheSubArray(myArr, startIndex, endIndex):
  length = (endIndex - startIndex) + 1
  for i in range(0, length // 2):
    temp = myArr[startIndex + i]
    myArr[startIndex + i] = myArr[endIndex - i]
    myArr[endIndex - i] = temp


def leftRotation(A, n, k):
  reverseTheSubArray(A, 0, k - 1)
  reverseTheSubArray(A, k, n - 1)
  reverseTheSubArray(A, 0, n - 1)
  return A
