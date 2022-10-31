Day 12 of 100 Days Of Code 
### Topic: 
    Pattern Syntax Checker 
### Question:
    Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.
    In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
    
    Input Format
    The first line of input contains an integer N, denoting the number of test cases. 
    The next N lines contain a string of any printable characters representing the pattern of a regex.
    
    Output Format
    For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes. 

 ### TEST CASES:
     CASE 1 : Normal pattern input
     INPUT: ([A-Z])(.+)
     OUTPUT: Valid
     CASE 2: Different pattern input
     OUTPUT: invalid
     CASE 3 : Integer input
     INPUT: 43
     OUTPUT: Invalid
 ### LOGIC:
     In this problem, a regex is only valid if you can compile it using the Pattern.compile method. 
     -------------------------------------------------------------------------------------------------------------------------------------------------------------------
 ### CODE:
     import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
          try{
              Pattern p = Pattern.compile(pattern);
              System.out.println("Valid");
          }catch(Throwable t){
              System.out.println("Invalid");
          }
          testCases--;
             
      }
   }
}
       
     
     
    
