package Day9;

public class Solution {
    public int trap(int[] A) {
        int n=A.length;
        
        int left[]=new int[n];
        int right[]=new int[n];
        
        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
        
        
        for(int i=0;i<n;i++){
            leftMax=Math.max(leftMax,A[i]);
            rightMax=Math.max(rightMax,A[n-i-1]);
            
            left[i]=leftMax;
            right[n-i-1]=rightMax;
        }
        
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(right[i],left[i])-A[i];
        }
        return ans;
        
    }

    
}
