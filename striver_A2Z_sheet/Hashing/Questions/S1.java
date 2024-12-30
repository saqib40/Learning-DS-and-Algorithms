import java.util.*;

public class S1 {
    // Given an array, we have found the number of occurrences of each element in the array.
    // Method 1 ; Brute Force using a nested loop has TC of O(n^2)
    // Method 2 ; Using Hashmap, TC is O(n) and SC is O(n)
    public static void solution(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr) {
            if(map.containsKey(x)) {
                map.put(x, map.get(x)+1);
            }
            else {
                map.put(x,1);
            }
        }
        // now print your hashmap
        for(HashMap.Entry<Integer,Integer> y : map.entrySet()) {
            System.out.println(y.getKey() + " " + y.getValue());
        }
    }
    // GFG question
    public static void frequencyCount(int arr[], int N, int P) {
        // do modify in the given array
        //HashMap<Integer, Integer> map = new HashMap<>();
        //LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        // iterate through array
        for (int x : arr) {
            if(x>N) {
                //map.put(x, 0);
                continue;
            }
            else if(map.containsKey(x)) {
                map.put(x, map.get(x)+1);
            }
            else {
                map.put(x,1);
            }
        }
        // now iterate through integers
        for (int i=1; i<=N; i++) {
            if(map.containsKey(i)) {
                continue;
            }
            else {
                map.put(i,0);
            }
        }
        // now print
        int i = 0;
        for(Map.Entry<Integer,Integer> y : map.entrySet()) {
            arr[i] = y.getValue();
            i++;
        }
        //System.out.println(Arrays.toString(arr));
    }
}
