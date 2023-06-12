def remove_duplicate(A, N):
  i = 0
  for j in range(1, N):
    if A[j] != A[i]:  #True when new element is found
      i = i + 1
      A[i] = A[j]
  return i + 1