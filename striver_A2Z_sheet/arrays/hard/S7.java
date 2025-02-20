
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S7 {
    public int[][] merge1(int[][] intervals) {
        int n = intervals.length;
        // sort by Ist elem if same sort by 2nd elem
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        List<int[]> ans = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            // the interval is already inside
            if(!ans.isEmpty() && end <= ans.get(ans.size()-1)[1]) {
                continue;
            }
            for(int j=i+1; j<n; j++) {
                if(intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                }
                else {
                    break;
                }
            }
            ans.add(new int[]{start,end});
        }
        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
    public int[][] merge2(int[][] intervals) {
        int n = intervals.length;
        // sort by Ist elem if same sort by 2nd elem
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        List<int[]> ans = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(ans.isEmpty()) {
                ans.add(intervals[i]);
            } else {
                int start = intervals[i][0];
                int end = intervals[i][1];
                if(start <= ans.get(ans.size()-1)[1]) {
                    ans.get(ans.size()-1)[1] = Math.max(end, ans.get(ans.size()-1)[1]);
                } else {
                    ans.add(new int[] {start, end});
                }
            }
        }
        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
