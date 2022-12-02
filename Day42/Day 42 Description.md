    DAY 42 OF MY 100 DAYS OF CODE
### TOPIC:
    Java Concatination of Array

### PROBLEM: 
    Concatenation of Array LeetCode Solution – Given an integer array nums of length n, 
    you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed)
    EXAMPLE
    Example 1:
    Input: nums = [1,2,1]
    Output: [1,2,1,1,2,1]
    Explanation: The array ans is formed as follows:
    - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
    - ans = [1,2,1,1,2,1]

    Example 2:
    Input: nums = [1,3,2,1]
    Output: [1,3,2,1,1,3,2,1]
    Explanation: The array ans is formed as follows:
    - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
    - ans = [1,3,2,1,1,3,2,1]

### TESTCASES:
    Input nums =[1,2,1]
    Output: [1,2,1,1,2,1]
    Expected: [1,2,1,1,2,1]

### ALGORITHM:
    Let’s save the length at the beginning of our function so that we have a snapshot of the length before we begin mutating our array. 
    If we were to only use nums.length inside of our loop, we’d be inside of an infinite loop since we continually increase the length as we push items.
    Instead, use the saved length and push numbers as you iterate through the input array
