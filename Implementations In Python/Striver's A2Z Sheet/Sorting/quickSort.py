def partition(A, start, end):
  pivot = A[end]
  pIndex = start
  for i in range(start, end):
    if A[i] <= pivot:
      temp = A[pIndex]
      A[pIndex] = A[i]
      A[i] = temp
      pIndex += 1
  temp = A[end]
  A[end] = A[pIndex]
  A[pIndex] = temp
  return pIndex


def quickSort(A, start, end):
  if start < end:
    pIndex = partition(A, start, end)
    quickSort(A, start, pIndex - 1)
    quickSort(A, pIndex + 1, end)