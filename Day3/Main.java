// package Day3;
import java.util.*;
public class Main{
    public int solve(ArrayList<Integer> A) {
        int odd=0,even=0;
        
        for(int ele:A){
            if(ele%2==0) even++;
            else odd++;
        }
        return Math.min(even,odd);
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 44, 3));
        System.out.println(new Main().solve(A));
    }
}