def printFibb(n):
  result = [0] * n
  f1 = 1
  f2 = 1
  if n == 1:
    result[0] = 1
  else:
    result[0] = 1
    result[1] = 1
    i = 2
    while i < n:
      f = f1 + f2
      f2 = f1
      f1 = f
      result[i] = f
      i += 1
  return result