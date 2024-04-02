package Day2;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        int A[]={1,29,32,4,55,6,7,99,88,66};
        System.out.println(findCount(A));
    }
    public static int findCount(int A[]){
        int n=A.length;
        Arrays.sort(A);
        int count=0;

        for(int i=0;i<n;i++){
            if(A[0]<A[i] && A[i]<A[n-1]) count++;
        }
        return count;
    }
}
