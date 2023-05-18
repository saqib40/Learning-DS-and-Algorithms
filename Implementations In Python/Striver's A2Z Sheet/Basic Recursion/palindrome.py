# Method 1; Iterative Way
def isPalindrome(S):
  n = len(S)
  i = 1
  while i < n // 2 + 1:
    if S[i - 1] == S[n - i]:
      i += 1
    else:
      return 0
  return 1


# Method 2; Using Recursion
def isPalindrome2(S, i = 0):
  if i >= len(S)//2:
    return True
  if S[i] != S[len(S)-1-i]:
    return False
  if S[i] == S[len(S)-1-i]:
    isPalindrome2(S, i+1)