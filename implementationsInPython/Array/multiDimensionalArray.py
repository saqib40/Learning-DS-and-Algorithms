#2D array (Matrix) of size; N x M where N is number of rows and M is number of columns

#We can access elements of matrix A like this; A[i][j]

#size; 3 x 4
matrix = [[1,2,3,4],
          [5,6,7,8],
          [9,10,11,12]]

#3D array (Multiple Matrices) of size; K x N x M where K is number of matrices of sizes N x M

#size; 2 x 2 x 2
multipleMatrix = [[[1,2],[2,3]],
                  [[4,5],[6,7]]]

#Transposing a matrix; Time complexity is O(n^2)
def transpose(matrix):
    N = len(matrix)
    M = len(matrix[0])
    transposedMatrix = []
    for j in range(M):
        row = []
        for i in range(N):
            row.append(matrix[i][j])
        transposedMatrix.append(row)
    return transposedMatrix

#More linear algebra operations on matrices yet to be done