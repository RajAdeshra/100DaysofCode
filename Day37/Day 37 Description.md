     DAY 37 OF MY 100 DAYS OF CODE
### Topic of the Day: 
Java Plus One Array
### PROBLEM:  
We are having a large integer represented as an integer array digits, where each digits[i] is the i'th digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's. 
Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

### TESTCASE:
Input : digits= [2,3,5]
Output  [2,3,6]
Expected  [2,3,6]

### Explanation:
Every time the case is dependent upon last index of every array based on that the cases are there. 
CASE 1: If we are adding one to it and it doesn't go beyond a then its false in case 1. 
Here after adding 1, 2, 3 then it becomes  1, 2, 4 and we can written that  1, 2, 4 as an answer.
CASE 2:
if all are 9 in that case if we keep on adding 1 to it. It will always give 10 and at one time. 
The array size will get exhausted at that time we have to update array size and we have to return updated array size as an answer.
