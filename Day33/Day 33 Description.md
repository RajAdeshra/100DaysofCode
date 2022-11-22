### TOPIC:
    Java Merge Sorted Array
### QUESTION:
    There are two integer arrays which are sorted in non-decreasing order, and two integers m and n, representing the number of elements.
    Merge two integers into a single array sorted in non-decreasing order.
    Example 1:
    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    Example 2:
    Input: nums1 = [1], m = 1, nums2 = [], n = 0
    Output: [1]
    Explanation: The arrays we are merging are [1] and [].
    The result of the merge is [1].

### TESTCASES:
    Your input:   [0,4,6,0,0,0]
    3
    [2,5,6]
    3
    Output:   [0,2,4,5,6,6]
    Expected:   [0,2,4,5,6,6]

### EXPLANATION:
    * The final sorted array should not be returned by the function, but instead be stored inside the array nums1 . 
    * To accommodate this, nums1 has a length of m + n , where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n . 
    * The arrays we are merging are [1,2,3] and [2,5,6].The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
