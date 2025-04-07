/*
    A non-empty array A consisting of N integers is given. 
    The array contains an odd number of elements, and each element of the array can be paired 
    with another element that has the same value, except for one element that is left unpaired.

    For example, in array A such that:

      A[0] = 9  A[1] = 3  A[2] = 9
      A[3] = 3  A[4] = 9  A[5] = 7
      A[6] = 9

    the elements at indexes 0 and 2 have value 9, 
    the elements at indexes 1 and 3 have value 3, 
    the elements at indexes 4 and 6 have value 9, 
    the element at index 5 has value 7 and is unpaired.

    Write a function:

        class Solution { 
            public int solution(int[] A); 
        }

    that, given an array A consisting of N integers fulfilling the above conditions, 
    returns the value of the unpaired element.

    For example, given array A such that:

      A[0] = 9  A[1] = 3  A[2] = 9
      A[3] = 3  A[4] = 9  A[5] = 7
      A[6] = 9

    the function should return 7, as explained in the example above.

    Write an efficient algorithm for the following assumptions:

    - N is an odd integer within the range [1..1,000,000];
    - Each element of array A is an integer within the range [1..1,000,000,000];
    - All but one of the values in A occur an even number of times.
*/
class Solution {
    public int solution(int[] A) {
        int result = 0;
        for (int num : A) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        int[] A1 = {9, 3, 9, 3, 9, 7, 9};
        System.out.println("Unpaired element: " + sol.solution(A1));  // Expected output: 7

        // Test case 2
        int[] A2 = {1, 2, 2, 1, 3};
        System.out.println("Unpaired element: " + sol.solution(A2));  // Expected output: 3

        // Test case 3
        int[] A3 = {5, 5, 6, 6, 7};
        System.out.println("Unpaired element: " + sol.solution(A3));  // Expected output: 7

        // Test case 4
        int[] A4 = {10};
        System.out.println("Unpaired element: " + sol.solution(A4));  // Expected output: 10
    }
}
