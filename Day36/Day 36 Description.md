### TOPIC: Java Monotonic Array
### QUESTION:
    An array is monotonic if it is either monotone increasing or monotone decreasing. 
    Given an integer array nums, return true if the given array is monotonic, or false otherwise.
    Example 1: 
    Input: nums = [1,2,2,3]
    Output: true

    Example 2:
    Input: nums = [6,5,4,4]
    Output: true

    Example 3:
    Input: nums = [1,3,2]
    Output: false

### TESTCASE: 
    Example1: Input: [1,2,2,4]  Output:  true
    Example2: Input: [6,5,4,7]     Output: false


### Description:
    In the following problem firstly, I have taken an Monotonic Array then I have sorted this into increasing order and decreasing order. 
    After that I have checked whether the array element of the input is exactly matching in ascending sorted array or descending sorted array. 
    Finally, we can say that it is Monotonic Array otherwise it is not.
