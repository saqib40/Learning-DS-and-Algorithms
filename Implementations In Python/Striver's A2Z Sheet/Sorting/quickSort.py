import random

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

def randomizedPartition(A, start, end):
    pivotIndex = random.randrange(start, end)
    temp = A[end]
    A[end] = A[pivotIndex]
    A[pivotIndex] = temp
    return partition(A, start, end)

def quickSort(A, start, end):
  if start < end:
    pIndex = randomizedPartition(A, start, end)
    quickSort(A, start, pIndex - 1)
    quickSort(A, pIndex + 1, end)
