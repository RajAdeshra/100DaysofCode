DAY 32 OF MY 100 DAYS OF CODE
### TOPIC:
    Java Bitset
### QUESTION:
    Given  BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0, perform a series of M operations. 
    After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
    Input Format
    The first line contains 2 space-separated integers, N(the length of both BitSets B1 and B2) and M(the number of operations to perform), respectively.
    The  subsequent lines each contain an operation in one of the following forms:
    AND <set><set>
    OR <set><set>
    XOR <set><set>
    FLIP<set><index>
    SET <set><index>
    In the list above, <set> is the integer 1 or 2, where 1 denotes B1 and 2 denotes B2.
    <index>is an integer denoting a bit's index in the BitSet corresponding to <set>.
    For the binary operations AND,OR, and XOR, operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. 
    For example:
    AND 2 1
    B2is the left operand, and B1 is the right operand. This operation should assign the result of B2^B1 to B2.
    Output Format
    After each operation, print the respective number of set bits in BitSet B1 and BitSet B2 as 2 space-separated integers on a new line.
### CONSTRAINTS:
    1<=N<=1000
    1<=M<=10000
### TEST CASES:
    CASE 1:
    INPUT:
    5 4
    AND 1 2
    SET 1 4
    FLIP 2 2
    OR 2 1
    OUTPUT:
    0 0
    1 0
    1 1
    1 2
    CASE 2:
    INPUT:
    10 10
    OR 1 2
    AND 2 1
    OR 1 2
    AND 2 1
    OR 1 2
    AND 2 1
    OR 1 2
    AND 2 1
    OR 1 2
    AND 2 1
    OUTPUT:
    0 0
    0 0
    0 0
    0 0
    0 0
    0 0
    0 0
    0 0
    0 0
    0 0
    
