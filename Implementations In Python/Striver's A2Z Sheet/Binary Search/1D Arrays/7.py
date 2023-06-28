# Number of occurances
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


def count(arr, n, x):
  a = firstOccurance(arr, n, x)
  b = lastOccurance(arr, n, x)
  if a == -1 and b == -1:
    return 0
  else:
    return (b - a) + 1


# Method 2; just the above approach but in a better way
def BS(A, n, x, searchFirst):
  low = 0
  high = n - 1
  result = -1
  while low <= high:
    mid = low + (high - low) // 2
    if x == A[mid]:
      result = mid
      if searchFirst:  # to search for first occurance
        high = mid - 1
      else:  # to search for last occurance
        low = mid + 1
    elif A[mid] > x:
      high = mid - 1
    else:
      low = mid + 1
  return result


def count2(arr, n, x):
  firstIndex = BS(arr, n, x, True)
  if firstIndex != -1:
    lastIndex = BS(arr, n, x, False)
    return (lastIndex - firstIndex) + 1
  else:
    return 0
