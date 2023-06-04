def insertionSort(A, n):
  for i in range(1, n):
    value = A[i]
    hole = i
    while (hole > 0 and A[hole - 1] > value):
      A[hole] = A[hole - 1]
      hole -= 1
    A[hole] = value
  return A
