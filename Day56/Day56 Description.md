Topic of the Day: Guess Number Higher or Lower(Binary Search)
Problem: Playing the Guess Game. The game is as follows: I pick a number from 1 to n. 
You have to guess which number I picked. Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess. 
You call a pre-defined API int guess(int num), which returns three possible results: -1: Your guess is higher than the number I picked (i.e. num > pick). 
1: Your guess is lower than the number I picked (i.e. num < pick).Return 0: your guess is equal to the number I picked (i.e. num == pick). 
Return the number that I picked.

Example 1:
Input: n = 10, pick = 6
Output: 6

Example 2:
Input: n = 1, pick = 1
Output: 1

Testcase:
Your input
10
6
1
1
2
1
Output
6
1
1
Expected
6
1

Explanation:
The approach is to generate a random number using Math. random() method in Java. Now using a loop, take K input from the user and for each input print whether the number is smaller or larger than the actual number. 
If within K trials the user guessed the number correctly, print that the user won.

