# Search insert position of K in a sorted array

# It's pure ceil problem with a little modification


def searchInsertK(Arr, N, k):
  low, high, ans = 0, N - 1, N
  while low <= high:
    mid = low + (high - low) // 2
    if Arr[mid] == k:
      return mid
    elif Arr[mid] > k:
      ans = mid
      high = mid - 1
    else:
      low = mid + 1
  return ans