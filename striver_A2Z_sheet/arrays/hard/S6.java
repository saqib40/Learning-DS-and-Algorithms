
import java.util.HashMap;

public class S6 {
    public long subarrayXor(int arr[], int k) {
        int xor = 0;
        long count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(xor,1);
        for(int i=0; i<arr.length; i++) {
            xor ^= arr[i];
            int x = xor ^ k;
            if(map.containsKey(x)) {
                count += map.get(x);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}
