package Day5;

public class Solution {
    public int maxProfit(int[] A) {
        int n=A.length;
        if(n<=0) return 0;
        int buy=A[0];
        int pro=0;
        
        for(int i=1;i<A.length;i++){
            buy=Math.min(buy,A[i]);
            pro=Math.max(pro,A[i]-buy);
        }
        return pro;
    }

    public static void main(String[] args) {
        int A[]={1,2,2,4,4,6,7,8,9,10};
        System.out.println(new Solution().maxProfit(A));
    }
}
