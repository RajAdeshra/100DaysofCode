### TOPIC:
Java Largest Number using String
### QUESTION: 
A list of non-negative integers nums, arrange them such that they form the largest number and return it. Since the result may be very large, so you need to return a string instead of an integer.
Example 1:
Input: nums = [10,2]
Output: "210"

Example 2:
Input: nums = [3,30,34,5,9]
Output: "9534330"

### Testcase:
Input
[10,2]
[3,30,34,5,9]
Output
"210"
"9534330"
Expected
"210"
"9534330"

### Explanation:
1.	First convert given array of integer values to array of string values
2.	Next sort the values by their alphanumeric values in a combination where:
3.	b + a and a + b are compared
4.	here b + a refers to b-string concatenated with a-string
5.	a and b refers to string values in the array
________________________________________________________________________________________________________________________________________________
### CODE:
    class solution {
    
        public String largestNumber(int[] nums) {
    String[] arr = new String[nums.length];
    for(int i=0; i<nums.length; i++){
        arr[i]=String.valueOf(nums[i]);
    }
 
    Arrays.sort(arr, new Comparator<String>(){
        public int compare(String a, String b){
            return (b+a).compareTo(a+b);
        }
    });
 
    StringBuilder sb = new StringBuilder();
    for(String s: arr){
        sb.append(s);
    }
 
    while(sb.charAt(0)=='0'&&sb.length()>1)
        sb.deleteCharAt(0);
 
    return sb.toString();
}
        
        
    }
