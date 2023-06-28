# The basic implementation


# Iterative Way
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


# Recursive Way
def recursiveBinarySearch(arr, low, high, k):
  if low > high:  #Exit condition 1
    return -1
  mid = low + (high - low) // 2
  if k == arr[mid]:
    return mid
  elif k < arr[mid]:
    return recursiveBinarySearch(arr, low, mid - 1, k)
  else:
    return recursiveBinarySearch(arr, mid + 1, high, k)
