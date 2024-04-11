package Day11;
public class Main {
    public int[] repeatedNumber(final int[] A) {
        int freq[] = new int[A.length];
        int ans[] = new int[2];
        
        for(int ele : A) {
            freq[ele - 1]++;
        }
        
        for(int i = 0; i < A.length; i++) {
            if(freq[i] == 2) 
                ans[0] = i + 1;
            else if(freq[i] == 0) 
                ans[1] = i + 1;
        }
        return ans;
    }



    public static void main(String[] args) {
        Main solution = new Main();
        
        int[] input = {3, 1, 2, 5, 3}; 
        int[] result = solution.repeatedNumber(input);
        
        System.out.println("Repeated number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }
}

