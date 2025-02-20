import java.util.HashMap;

public class S5 {
    int maxLen(int arr[]) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        for(int i=0; i<arr.length; i++) {
            prefixSum += arr[i];
            if(prefixSum==0) {
                max = i+1;
            } else {
                if(map.containsKey(prefixSum)) {
                    max = Math.max(i-map.get(prefixSum), max);
                } else {
                    map.put(prefixSum,i);
                }
            }
        }
        return max;
    }
}
