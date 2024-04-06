public class Solution {
    public int[] getRow(int A) {
        int dp[][] = new int[A + 1][];
        dp[0] = new int[]{1};

        for (int i = 1; i <= A; i++) {
            dp[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[A];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int A = 5; 
        int[] row = solution.getRow(A);

        System.out.println("Row " + A + " of Pascal's Triangle:");
        for (int num : row) {
            System.out.print(num + " ");
        }
    }
}

