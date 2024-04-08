public class Solution {
    public int solve(int[] A) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            maxSum=Math.max(maxSum,sum);
            if(sum<0) sum=0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int A[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new Solution().solve(A));
    }
}
