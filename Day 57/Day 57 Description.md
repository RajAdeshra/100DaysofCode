Day 57 of my 100 Days of Code
### Problem: 
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well. 
You must not use any built-in exponent function or operator. For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 
Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

## Testcase:
Your input
4
8
Output
2
2
Expected
2
2

### Explanation:
The result of sqrt(x) will be the closest perfect square, a, to the left of x, including itself (a^2 <= x). 
Assuming a^2 <= x, the closest perfect square to the right of x is (a + 1)^2. 
This gives us the tightest integer left and right bounds: a^2 <= x < (a + 1)^2, which, in turn, gives us a <= sqrt(x) < (a + 1)
