### Topic of the Day: 
Search in Rotated Sorted Array (Binary Search)

### Problem: 
There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]. Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums. You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0

Output: 4



Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3

Output: -1



### Testcase:

Your input

[4,5,6,7,0,1,2]

0

[4,5,6,7,0,1,2]

3

[1]

0

Output

4

-1

-1

Expected

4

-1



### Explanation:

In order to use binary search on the rotated sorted array, we need to determine how to update the left and right pointers. 
There are two major cases as shown below: Once the two cases are identified, the problem is straightforward to solve. 
We only need to check if the target element is in the sorted side, and based on that move left or right pointers.
