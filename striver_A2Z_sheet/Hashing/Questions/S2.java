import java.util.*;
public class S2 {
    // striver ki problem
    // Method 1:- Brute force; using two loops has TC of O(n^2) to no one's surprise
    // Method 2: Using map TC being O(n)
    // essence is iterate through array then through map
    public static int[] solution(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr) {
            if(map.containsKey(x)) {
                map.put(x, map.get(x)+1);
            }
            else {
                map.put(x,1);
            }
        }
        int highest = 0;
        int highestFreq = 1;
        int lowest = 0;
        int lowestFreq = 1;
        for(HashMap.Entry<Integer,Integer> y : map.entrySet()) {
            if(y.getValue() >= highestFreq) {
                highest = y.getKey();
            }
            if(y.getValue() <= lowestFreq) {
                lowest = y.getValue();
            }
        }
        int[] me = {highest, lowest};
        return me;
    }
    // leetcode wali problem
    // solve after studying Sliding window
}
