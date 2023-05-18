def printNos(N):
  if N == 1:
    print(1, end=' ')
  else:
    temp = N  #this is reduntant line
    printNos(N - 1)  #for GFG problem use self.printNos(N-1)
    print(temp, end=' ')
