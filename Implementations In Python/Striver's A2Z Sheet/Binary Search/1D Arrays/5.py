#Method 1; (Brute Force)
def findCeil(A, N, x):
  low, high, ans = 0, N - 1, -1
  while low <= high:
    mid = low + (high - low) // 2
    if A[mid] == x:
      return mid
    elif A[mid] > x:
      ans = mid
      high = mid - 1
    else:
      low = mid + 1
  return ans


def findFloor(arr, N, X):
  low, high, ans = 0, N - 1, -1
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


def getFloorAndCeil(arr, n, x):
  arr.sort()
  A = [0, 0]
  i, m = findFloor(arr, n, x), findCeil(arr, n, x)
  if i != -1:
    A[0] = arr[i]
  else:
    A[0] = i
  if m != -1:
    A[1] = arr[m]
  else:
    A[1] = m
  return A


# Method 2;
def getFloorAndCeil2(arr, n, x):
  arr.sort()
  A = [-1, -1]  # A[0] represents floor & A[1] represents ceil
  low, high = 0, n - 1
  while low <= high:
    mid = low + (high - low) // 2
    if arr[mid] == x:
      A[0] = arr[mid]
      A[1] = arr[mid]
      return A
    elif arr[mid] > x:
      A[1] = arr[mid]
      high = mid - 1
    else:
      A[0] = arr[mid]
      low = mid + 1
  return A


# Method 3;
