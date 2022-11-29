  DAY 40 OF MY 100 DAYS OF CODE
### Topic of the Day: 
    Java Array Missing Number
### Problem: 
    An array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
    Example 1:
    Input: nums = [3,0,1]
    Output: 2
    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
    Example 2:
    Input: nums = [0,1]
    Output: 2
    Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
### Testcase:
    Your input
    [3,0,1]
    [0,1]
    [9,6,4,2,3,5,7,0,1]
    Output
    2
    2
    8
    Expected
    2
    2

### Explanation:
    1.	Calculate the sum of the first n natural numbers as sumtotal= n*(n+1)/2.
    2.	Create a variable sum to store the sum of array elements.
    3.	Traverse the array from start to end.
    4.	Update the value of sum as sum = sum + array[i]
    5.	Print the missing number as sumtotal – sum.
