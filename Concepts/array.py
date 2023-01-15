"""
An array is a contiguous collection of homogeneous elements
that can be accessed using an index. By contiguous,
we mean the elements of the array are adjacent to one
another in memory with no gaps between them, and by homogeneous
we mean they are all of the same data type. The index of an array of
size N can range from 0 to NH1.
In a static array, we declare size initially but in a
dynamic array, the size increases as more elements are added to the array.
In python, both are the same thing.
"""

arrayOfIntegers = [2, 3, 4, 5]
arrayOfFloats = [2.1, 3.2, 4.5, 5.6]
arrayOfStrings = ['saqib', 'hamza', 'sodhi']

#Basic operations on array

#Searching in an array; Time complexity o(n) (You will be learning about different search algorithms in future which will highly optimize your search operations)
def search(element, array):
    for x in array:
        if element == x:
            return True
    return False

#Writing a program to reverse an array
def reverse(array):
    reversedArray = []
    i = len(array) - 1
    while i >= 0:
        reversedArray.append(array[i])
        i -= 1
    return reversedArray

def reverse2(array,start, end)
#Left rotate an array
"""
Given an array of integers arr[] of size N
and an integer d, the task is to rotate the array elements
to the left by d positions.
"""

# Time complexity is O(n^2) because popping an arbitatry element
def leftRotate(d, arr):
    i = 0
    while i < d:
        arr.append(arr[0])
        arr.pop(0)
        i += 1
    return arr

#we can see pop operation here; Time complexity O(n)
def popOperation(k, array):
    size = len(array)
    while k < size -1:
        array[k] = array[k+1]
        k += 1
    del array[-1]
    return array

def leftRotate2(d, arr) #reduce time complexity
#Right rotate an array