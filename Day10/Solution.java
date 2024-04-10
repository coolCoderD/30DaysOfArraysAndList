package Day10;
import java.util.*;

public class Solution {
    public static class Interval {
        int start;
        int end;
        
        Interval() { 
            start = 0; 
            end = 0; 
        }
        
        Interval(int s, int e) { 
            start = s; 
            end = e; 
        }
    }

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int i = 0;
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            i++;
        }
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            intervals.remove(i);
        }
        intervals.add(i, newInterval);
        return intervals;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1,2));
        intervals.add(new Interval(3,5));
        intervals.add(new Interval(6,7));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(12,16));

        Interval newInterval = new Interval(4, 8);
        ArrayList<Interval> result = solution.insert(intervals, newInterval);

        System.out.println("Merged Intervals:");
        for (Interval interval : result) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
