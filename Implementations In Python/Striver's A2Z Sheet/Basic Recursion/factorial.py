def factorialIterative(n):
  result = 1
  for x in range(2, n+1):
    result *= x
  return result

def factorialRecursive(n):
  if n == 1:
    return 1
  else:
    return n * factorialRecursive(n-1)

#Given a number N, the task is to return the list/vector of the factorial numbers smaller than or equal to N.

#Brute force
def factorialNumbers(N):
  answer = []
  i = 1
  while True:
    a = factorialRecursive(i)
    if a <= N:
      answer.append(i)
      i += 1
    else:
      break
  return answer

#Optimisation
def factorialNumbers2(N):
  answer = []
  fact = 1
  x = 2
  while fact <= N:
    answer.append(fact)
    fact *= x
    x += 1
  return answer