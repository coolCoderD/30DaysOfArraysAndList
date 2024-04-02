package Day1;
import java.util.*;

public class Main{
    public static int maxMod(ArrayList<Integer> A){
        int firstLargest=-Integer.MIN_VALUE;
        int secondLargest=-Integer.MIN_VALUE;

        for(int ele:A){
            if(ele>firstLargest){
                secondLargest=firstLargest;
                firstLargest=ele;
            }else if(ele>secondLargest){
                secondLargest=ele;
            }
        }

        return (secondLargest<0)? 0:secondLargest;
    }

    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 44, 3));
        System.out.println("Max mod is : " + maxMod(A));
    }
}