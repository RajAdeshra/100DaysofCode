     DAY 41 OF MY 100 DAYS OF CODE
### Topic of the Process:  
    Java Shuffle an Array
### PROBLEM: 
    Given an integer array nums, design an algorithm to randomly shuffle the array. 
    All permutations of the array should be equally likely as a result of the shuffling.
    EXAMPLE:
    Initial Array: [2,5,1,3,4,7] n=3
    Before Shuffle: [2,5,1,3,4,7]
    After Shuffle: [2,3,5,4,1,7]
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
    Example 2:
    Input: nums = [1,2,3,4,4,3,2,1], n = 4
    Output: [1,4,2,3,3,2,4,1]
    EXPLANATION:  
    We can iterate through the array elements in a for loop. Then, we use the Random class to generate a random index number. 
    Then swap the current index element with the randomly generated index element. At the end of the for loop, we will have a randomly shuffled array.

### EXPLANATION:
    1. Take the input for the number of elements for the array.
    2. Take the input for the elements of the array.
    3. Define a demo() function, which will have the below functioning.
    4. The concept is to begin at an end.
    5. Let's pretend we're starting from the beginning, and the array size is n. 
    6. rand() function will generate a random number from 0 to j, every time the loop is in action.
    7. For j=n-1 to 1
                  1. Pick an element in the range [0,j-1] randomly
                   2. Swap the randomly picked element with a[j]
                   3. Decrement j
    8. End for loop
    9. By doing so, a new array will be created.
