# TC; O(n^2)
def selectionSort(A, n):
  for i in range(0, n - 2):
    iMin = i
    for j in range(i + 1, n):
      if A[j] < A[iMin]:
        iMin = j
    temp = A[i]
    A[i] = A[iMin]
    A[iMin] = temp
  return A
