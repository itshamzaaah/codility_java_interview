/*
    An array A consisting of N integers is given. 
    Rotation of the array means that each element is shifted right by one index, 
    and the last element of the array is moved to the first place.

    For example:
    The rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] 
    (elements are shifted right by one index and 6 is moved to the first place).

    The goal is to rotate array A K times; that is, each element of A will be 
    shifted to the right K times.

    Write a function:

        class Solution { 
            public int[] solution(int[] A, int K); 
        }

    that, given an array A consisting of N integers and an integer K, 
    returns the array A rotated K times.

    Examples:

    A = [3, 8, 9, 7, 6]
    K = 3
    The function should return [9, 7, 6, 3, 8]. Three rotations were made:
        [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
        [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
        [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]

    A = [0, 0, 0]
    K = 1
    The function should return [0, 0, 0]

    A = [1, 2, 3, 4]
    K = 4
    The function should return [1, 2, 3, 4]

    Assumptions:
    - N and K are integers within the range [0..100];
    - Each element of array A is an integer within the range [−1,000..1,000].

    In your solution, focus on correctness. 
    The performance of your solution will not be the focus of the assessment.
*/

class Solution {
    public int[] solution(int[] A, int K) {
        int n = A.length;
        if (n == 0) return A;  // If the array is empty, just return it

        K = K % n;  // Normalize K to prevent extra rotations
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + K) % n] = A[i];
        }
        return rotated;
    }
    
    // Optional main method to test the solution.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int[] result = sol.solution(A, K);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Expected output: 9 7 6 3 8
    }
}
