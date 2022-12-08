Day 46 of my 100 days of Code
### Topic of the Day: 
Java Longest Consecutive Array 
Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 
### Testcase:
Your input: [100,4,200,1,3,2]
Output: 4
Expected: 4

### Constraints:
•	0 <= nums.length <= 105
•	-109 <= nums [i] <= 109
Explanation:
We can also project the arrays to a new array with length to be the largest element in the array. 
Then iterate over the array and get the longest consecutive sequence. If the largest number is very large, then the time complexity would be bad.
The idea is to first sort the array and find the longest subarray with consecutive elements. 
After sorting the array and removing the multiple occurrences of elements, run a loop and keep a count and max (both initially zero).
