package Day4;
public class Solution {
    public int solve(int[] A) {
        int count=1;
        
        for(int i=1;i<A.length;i++){
            if(A[i-1]%2==0 && A[i]%2==0 || A[i-1]%2==1 && A[i]%2==1) continue;
            else count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int A[]={1,2,2,4,4,6,7,8,9,10};
        System.out.println(new Solution().solve(A));
    }
}
