# Ceil aka Upper Bound


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
