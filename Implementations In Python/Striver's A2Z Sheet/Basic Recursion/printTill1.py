def printNos(n):
  if n == 1:
    print(1, end=' ')
    return
  else:
    print(n, end=' ')
    return printNos(n - 1)  #again for GFG problem use self.printNos(N-1)
