# Using formula
def sumOfSeries(N):
  return ((N**2) * (N + 1)**2) // 4


# Using for loop
def sumOfSeries2(N):
  sum = 0
  for x in range(1, N + 1):
    sum += (x**3)
  return sum


# Using recursion (functional)
def sumOfSeries3(N):
  if N == 1:
    return 1
  else:
    return (N**3) + sumOfSeries3(N - 1)


# Using recursion (parameterized)
def sumOfSeries4(N, sum=1):
  if N == 1:
    return sum
  else:
    return sumOfSeries4(N - 1, sum + N**3)
