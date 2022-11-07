 Day 18 of My 100 Days of Code challenge
### Topic of the Day: 
    Java Reverse Vowels of a String
### QUESTION: 
    A string s, reverse only all the vowels in the string and return it. 
    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
    Example 1:
    Input: s = "hello"
    Output: "holle"
    Example 2:
    Input: s = "leetcode"
    Output: "leotcede"
### TEST CASE: 
    Runtime: 0 ms
    Your input: "hello"
    Output: "holle" 
    Expected: "holle"

### EXPLANATION:
    Our task is to reverse only the vowels of string. 
    One simple solution is to store all the vowels while scanning the string and placing the vowels in the reverse order in another iteration of string.
__________________________________________________________________________________________________________________________________________________________________
### CODE:
    class solution {
    public String reverseVowels(String s) {
    HashSet<Character> vowels = new HashSet<Character>();
    Collections.addAll(vowels, 'a','e','i','o','u','A','E','I','O','U');
    int left = 0, right = s.length() - 1;
    char[] chars = s.toCharArray();
    while (left < right) {
    if (!vowels.contains(chars[left])) {
    left ++;
    continue;
    }
    if (!vowels.contains(chars[right])) {
    right --;
    continue;
    }
    char tmp = chars[left];
    chars[left] = chars[right];
    chars[right] = tmp;
    left ++;
    right --;
    }
        return new String(chars);
    }
}
