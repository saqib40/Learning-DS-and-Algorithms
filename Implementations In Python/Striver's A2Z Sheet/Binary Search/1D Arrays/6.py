# First and last occurrences of x


# Method 1
def firstOccurance(A, n, x):
  low = 0
  high = n - 1
  result = -1
  while low <= high:
    mid = low + (high - low) // 2
    if x == A[mid]:
      result = mid
      high = mid - 1
    elif A[mid] > x:
      high = mid - 1
    else:
      low = mid + 1
  return result


def lastOccurance(A, n, x):
  low = 0
  high = n - 1
  result = -1
  while low <= high:
    mid = low + (high - low) // 2
    if x == A[mid]:
      result = mid
      low = mid + 1
    elif A[mid] > x:
      high = mid - 1
    else:
      low = mid + 1
  return result


def find(arr, n, x):
  A = [0, 0]
  A[0] = firstOccurance(arr, n, x)
  A[1] = lastOccurance(arr, n, x)
  return A
