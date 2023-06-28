# Floor aka Lower Bound
def binarySearch(arr, n, k):
  start = 0
  end = n - 1
  while start <= end:
    mid = start + (end - start) // 2
    if arr[mid] == k:
      return mid
    elif k < arr[mid]:
      end = mid - 1
    else:
      start = mid + 1
  return -1


# Method 1, TC being O(mLogN)
def findFloor(A, N, x):
  i = 0
  while x > 0:
    z = binarySearch(A, N, x - i)
    if z != -1:
      return z
    x -= 1
  return -1


# Tc of O(LogN)
def findFloor2(arr, N, X):
  low = 0
  high = N - 1
  ans = -1
  while (low <= high):
    mid = (low + high) // 2
    if arr[mid] == X:
      return mid
    elif (arr[mid] > X):
      high = mid - 1
    else:
      ans = mid
      low = mid + 1
  return ans
