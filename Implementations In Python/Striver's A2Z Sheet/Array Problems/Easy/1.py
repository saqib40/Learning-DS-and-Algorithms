def largest(arr, n):
  max = arr[0]
  for x in arr:
    if x > max:
      max = x
  return max
