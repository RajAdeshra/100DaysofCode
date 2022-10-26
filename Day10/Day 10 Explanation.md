// Day 10 of my 100 Days of Code Challenge 
  ### TOPIC:  
     Java String Tokens
   
  ### Question : 
    Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
    We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
  ### Constraints :
   * 1<=length of a <= 4.10^5
   * is composed of any of the following: 
   English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
   
  ### Sample Input:
   He is a very very good boy, isn't he?
  ### Sample Output:
    10
    He
    is
    a
    very
    very
    good
    boy
    isn
    t
    he
  ### Test Cases:
      CASE 1: We input normal sentence to test whether the code is compiled properly or not.
      INPUT :
      I am Raj Adeshra
      OUTPUT:
      4
      I
      am
      Raj
      Adeshra
      CASE 2 : We input a integer to test out the constraints implied in this code.
      INPUT:
      12
      OUTPUT:
      0
      Explanaton : As it is not a string it will output 0 or null.
  ### LOGIC:
  
      We consider a token to be a contiguous segment of alphabetic characters. 
      There are a total of 10 such tokens in string s, and each token is printed in the same order in which it appears in string .
  --------------------------------------------------------------------------------------------------------------------------------------------------
  ### CODE:
      import java.io.*;
      import java.util.*;
      import java.text.*;
      import java.math.*;
      import java.util.regex.*;

      public class Solution {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String S = sc.nextLine();
      String[] tokens = S.split("[^a-zA-Z]");
      int numTokens = 0;
        
      for (int i=0; i<tokens.length; ++i) 
       if (tokens[i].length() > 0) 
          numTokens++;
             
      System.out.println(numTokens);
        
      for (int i=0; i<tokens.length;++i)
        if (tokens[i].length() > 0)
          System.out.println(tokens[i]);
    }
    }

      
   
   
   
