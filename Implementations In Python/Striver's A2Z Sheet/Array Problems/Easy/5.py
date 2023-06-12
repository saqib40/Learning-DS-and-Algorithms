# Left rotate an array by one place
def leftRotate1(A, n):
  first = A[0]
  for i in range(1, n):
    A[i - 1] = A[i]
  A[n - 1] = first
  return A