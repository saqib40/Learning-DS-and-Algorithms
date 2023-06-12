def arraySortedOrNot(arr, n):
  me = arr[0]
  for i in range(1, n):
    if arr[i] >= me:
      me = arr[i]
    else:
      return 0
  return 1