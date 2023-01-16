"""
An array is a contiguous collection of homogeneous elements
that can be accessed using an index. By contiguous,
we mean the elements of the array are adjacent to one
another in memory with no gaps between them, and by homogeneous
we mean they are all of the same data type. The index of an array of
size N can range from 0 to NH1. In a static array, we declare size initially but in a
dynamic array, the size increases as more elements are added to the array.
In python, both are the same thing.
"""

arrayOfIntegers = [2, 3, 4, 5]
arrayOfFloats = [2.1, 3.2, 4.5, 5.6]
arrayOfStrings = ['saqib', 'hamza', 'sodhi']

#Basic operations on array

#Searching in an array; Time complexity O(n) (You will be learning about different search algorithms in future which will highly optimize your search operations)
def search(element, array):
    for x in array:
        if element == x:
            return True
    return False

#Writing a program to reverse an array; Time complexity O(n)
def reverse(array):
    reversedArray = []
    i = len(array) - 1
    while i >= 0:
        reversedArray.append(array[i])
        i -= 1
    return reversedArray

#reversing with recursion

#Left rotate an array
"""
Given an array of integers arr[] of size N
and an integer d, the task is to rotate the array elements
to the left by d positions.
"""

#Method 1; Time complexity is O(n^2) because popping an arbitatry element
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

#Method 2; Time complexity O(n)
def leftRotate2(d, arr):
    array1 = []
    array2 = []
    i = 0
    while i < d:
        array1.append(arr[i])
        i += 1
    while i < len(arr):
        array2.append(arr[i])
        i += 1
    return array2 + array1

#Method 3; Time Complexity O(n) (because slicing is nothing but copying)
def leftRotate3(d,arr):
    return arr[d:] + arr[:d]

#Method 4; Juggling Algorithm (to learn)

#Right rotate an array

#Method 1; Time Complexity O(n^2)
def rightRotate(d, arr):
    i = 0
    while i < d:
        arr.insert(0, arr[len(arr)-1])
        arr.pop()
        i += 1
    return arr

#visualizing insertion; Time complexity O(n)
def insertion(shitToInsert, position, array):
    lastElement = array[-1]
    i = len(array) - 1
    while i > position:
        array[i] = array[i-1]
        i -= 1
    array[i] = shitToInsert
    array.append(lastElement)
    return array

#Method 2; Time Complexity O(n)
def rightRotate2(d, arr):
    return arr[-d:] + arr[:d+1]

"""
Generating all subarrays;
for an array/string of size n, there are n*(n+1)/2
non-empty subarrays/substrings.
"""
#Method 1; Using recursion with Time complexity of O()


#Method 2; Using loops with Time complexity of O(n^3)
def subArrays(array):
    answer = []
    for x in range(len(array)):
        i = x + 1
        while i <= len(array):
            answer.append(array[x:i])
            i += 1
    return answer
