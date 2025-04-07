/*
    A binary gap within a positive integer N is any maximal sequence of consecutive zeros 
    that is surrounded by ones at both ends in the binary representation of N.

    For example:
    - The number 9 has binary representation 1001 and contains a binary gap of length 2.
    - The number 529 has binary representation 1000010001 and contains two binary gaps: 
      one of length 4 and one of length 3.
    - The number 20 has binary representation 10100 and contains one binary gap of length 1.
    - The number 15 has binary representation 1111 and has no binary gaps.
    - The number 32 has binary representation 100000 and has no binary gaps.

    Write a function:

        class Solution { 
            public int solution(int N); 
        }

    that, given a positive integer N, returns the length of its longest binary gap. 
    The function should return 0 if N doesn't contain a binary gap.

    For example:
    - Given N = 1041, the function should return 5, because N has binary representation 
      10000010001 and the longest binary gap is of length 5.
    - Given N = 32, the function should return 0, because N has binary representation 
      100000 and thus no binary gaps.

    Write an efficient algorithm for the following assumptions:
    - N is an integer within the range [1..2,147,483,647].
*/


class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int maxGap = 0, currentGap = 0;
        boolean foundOne = false;
        
        for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                // When a '1' is encountered, update maxGap if needed and reset current gap
                if (foundOne) {
                    maxGap = Math.max(maxGap, currentGap);
                }
                foundOne = true;
                currentGap = 0;
            } else if (foundOne) {
                // Only count zeros after the first '1'
                currentGap++;
            }
        }
        
        return maxGap;
    }
    
    // Optional: A main method to test the solution.
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Longest binary gap for 1041 is: " + sol.solution(1041)); // Expected output: 5
        System.out.println("Longest binary gap for 32 is: " + sol.solution(32));     // Expected output: 0
        System.out.println("Longest binary gap for 529 is: " + sol.solution(529));   // Expected output: 4
    }
}
