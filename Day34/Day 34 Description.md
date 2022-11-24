DAY 34 OF MY 100 DAYS OF CODE
### TOPIC:
    Java Intersection of Two Arrays
### QUESTION: 
    The two integer arrays nums1 and nums2, return an array of their intersection. 
    Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
    Example 1:
    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2,2]
    Example 2:
    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    Output: [4,9]
    Explanation: [9,4] is also accepted.

### TESTCASE:
    Your input
    [1,2,2,1]
    [2,2]
    [4,9,5]
    [9,4,9,8,4]
    Output
    [2,2]
    [4,9]
    Expected
    [2,2]
    [4,9]
 
### EXPLANATION:
    Print both given arrays. Loop through first array till the first array length. 
    Inside first array loop, loop the second array till the length of the second array. 
    Print the third resulting array showing intersection of the two given arrays.
