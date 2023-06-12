# Method 1; TC is O(N) & SC is O(1)
def searchInSorted(arr, N, K):
  for x in arr:
    if x == K:
      return 1
  return -1


# Method 2; As the array is sorted we can use binary search
# whose TC is O(LogN)
# Binary Search to yet to learn