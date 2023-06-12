#Method 1
def largest(arr, n):
  max = arr[0]
  for x in arr:
    if x > max:
      max = x
  return max


def slargest(arr, n):
  sLargest = -1
  largestE = largest(arr, n)
  for x in arr:
    if x == largestE:
      continue
    if x > sLargest:
      sLargest = x
  return sLargest


#Method 2
def sLargest2(arr, n):
  sLargest = -1
  largestE = arr[0]
  for x in arr:
    if x > largestE:
      sLargest = largestE
      largestE = x
    if x > sLargest and x < largestE:
      sLargest = x
  return sLargest
