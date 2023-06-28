# Rotation


# Method 1; TC of O(N)
def findKRotation(arr, n):
  numberOfRotations = 0
  i = 0
  while i < n - 1:
    if arr[i] > arr[i + 1]:
      numberOfRotations += 1
    i += 1
  return numberOfRotations


# Method 2; TC of O(LogN)
def findKRotation2(arr, n):
  low = 0
  high = n - 1
  while low <= high:
    if arr[low] <= arr[high]:
      return low
    mid = low + (high - low) // 2
    next = (mid + 1) % n
    prev = (mid + n - 1) % n
    if arr[mid] <= arr[next] and arr[mid] <= arr[prev]:
      return mid
    elif arr[mid] <= arr[high]:
      high = mid - 1
    elif arr[mid] >= arr[low]:
      low = mid + 1
  return -1  # in cases of invalid inputs
