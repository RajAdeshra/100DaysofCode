Day 13 of 100 Days of Code
### TOPIC:
    java Regex 2 Duplicate Words
### QUESTION:
    In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once, but retain the first occurrence of any case-insensitive repeated word. For example, the words love and to are repeated in the sentence I love Love to To tO code. 
    Can you complete the code in the editor so it will turn I love Love to To tO code into I love to code?
    
    Input Format
    The following input is handled for you the given stub code:
    The first line contains an integer, n, denoting the number of sentences.
    Each of the n subsequent lines contains a single sentence consisting of English alphabetic letters and whitespace characters.
    Output Format
    Stub code in the editor prints the sentence modified by the replaceAll line to stdout. 
    The modified string must be a modified version of the initial sentence where all repeat occurrences of each word are removed.
### Constraints:
   * Each sentence consists of at most 10^4 English alphabetic letters and whitespaces.
   * 1<=n<=100
   
### TEST CASES:
    CASE 1: Normal repetitive words
    INPUT:
    2
    Goodbye bye bye world world world
    Sam went went to to to his business
    OUTPUT:
    Goodbye bye world
    Sam went to his business
    CASE 2: Integer Input
    INPUT:
    23
    OUTPUT: 
    Invalid Input
### LOGIC:
    input = input.replaceAll(m.group(), m.group(1))
    The line of code above replaces the entire match with the first group in the match.
    m.group() is the entire match 
    m.group(i) is the ith match. So m.group(1) is the 1st match (which is enclosed in the 1st set of parentheses)
    The ?: is added to make it a "non-capturing group" (meaning you can't do .group() to get the group), for slightly faster performance.
   -----------------------------------------------------------------------------------------------------------------------------------------------------------------
### CODE:
    public class DuplicateWords {

    public static void main(String[] args) {

    String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    Scanner in = new Scanner(System.in);
    int numSentences = Integer.parseInt(in.nextLine());
        
    while (numSentences-- > 0) {
    String input = in.nextLine();
            
    Matcher m = p.matcher(input);
            
    // Check for subsequences of input that match the compiled pattern
    while (m.find()) {     
    input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}

    
    
