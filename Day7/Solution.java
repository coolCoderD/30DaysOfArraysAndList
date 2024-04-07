package Day7;

public class Solution {
    public int[][] solve(int[][] A) {
        int n = A.length;
        
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = A[j][i];
                A[j][i] = A[i][j];
                A[i][j] = temp;
            }
        }
        
        // Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            
            while (right > left) {
                int temp = A[i][right];
                A[i][right] = A[i][left];
                A[i][left] = temp;
                left++;
                right--;
            }
        }
        
        return A;
    }

    public static void main(String[] args) {
        int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Solution solution = new Solution();
        int[][] result = solution.solve(A);
        
        // Printing the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
