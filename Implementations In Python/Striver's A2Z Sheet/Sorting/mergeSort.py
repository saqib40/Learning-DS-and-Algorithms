def merge(L, R, A):
  nL = len(L)
  nR = len(R)
  i, j, k = 0, 0, 0
  while (i < nL and j < nR):
    if L[i] <= R[j]:
      A[k] = L[i]
      i += 1
    else:
      A[k] = R[j]
      j += 1
    k += 1
  while (i < nL):
    A[k] = L[i]
    i += 1
    k += 1
  while (j < nR):
    A[k] = R[j]
    j += 1
    k += 1


def mergeSort(A):
  n = len(A)
  if n < 2:
    return
  mid = n // 2
  left = [0] * mid
  right = [0] * (n - mid)
  for i in range(0, mid):
    left[i] = A[i]
  for i in range(mid, n):
    right[i - mid] = A[i]
  mergeSort(left)
  mergeSort(right)
  merge(left, right, A)