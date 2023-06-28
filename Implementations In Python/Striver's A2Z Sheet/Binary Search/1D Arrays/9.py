# Search in a Rotated Array

# Method 1; Time Limit Exceeded error


def BS(arr, low, high, k):
  if low > high:  #Exit condition 1
    return -1
  mid = low + (high - low) // 2
  if k == arr[mid]:
    return mid
  elif k < arr[mid]:
    return BS(arr, low, mid - 1, k)
  else:
    return BS(arr, mid + 1, high, k)


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


def search(A, l, h, key):
  k = findKRotation2(A, h - l + 1)
  a = BS(A, 0, k - 1, key)
  if a == -1:
    return BS(A, k, h, key)
  else:
    return a


# Method 2; (Even though I tried hard to understand and I know more or less the logic behind the code it's not fully clear to me)
def search2(A, l, h, key):
  while l <= h:
    mid = l + (h - l) // 2
    if A[mid] == key:
      return mid
    elif A[mid] <= A[h]:
      if key > A[mid] and key <= A[h]:
        l = mid + 1
      else:
        h = mid - 1
    else:  # condition being (A[low] <= A[mid])
      if key >= A[l] and key < A[mid]:
        h = mid - 1
      else:
        l = mid + 1
  return -1
