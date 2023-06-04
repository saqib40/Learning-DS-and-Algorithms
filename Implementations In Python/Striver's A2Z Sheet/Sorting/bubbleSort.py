def bubbleSort(A, n):
  for k in range(1, n):
    flag = 0
    for i in range(0, n - k):
      if A[i] > A[i + 1]:
        temp = A[i + 1]
        A[i + 1] = A[i]
        A[i] = temp
        flag = 1
    if flag == 0:
      break
  return A
