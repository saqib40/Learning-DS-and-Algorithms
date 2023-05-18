def printGfg(n):
  if n == 1:
    print('GFG', end=' ')
    return
  else:
    print('GFG', end=' ')  #again for GFG problem use self.printNos(N-1)
    printGfg(n - 1)
