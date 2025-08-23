import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class S9 {
    // you can just use a simple hashset for the job
    // using a tree map, TC is O((m+n)*Log(m+n))
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : arr1) {
            map.put(i,1);
        }
        for(int i : arr2) {
            map.put(i,1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> y : map.entrySet()) {
            arr.add(y.getKey());
        }
        return arr;
    }
    // using two pointers, TC is O(m+n); works fine but ironically throws TLE
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> arr = new ArrayList<>();
        int n = a.length;
        int i = 0;
        int m = b.length;
        int j = 0;
        while(i<n && j<m) {
            if(a[i] == b[j]) {
                if(arr.size() == 0 || arr.get(arr.size()-1) != a[i]) { // to avoid duplication
                    arr.add(a[i]);
                }
                i++; j++;
            }
            else if(a[i] > b[j]) {
                if(arr.size() == 0 || arr.get(arr.size()-1) != b[j]) {
                    arr.add(b[j]);
                }
                j++;
            }
            else {
                if(arr.size() == 0 || arr.get(arr.size()-1) != a[i]) {
                    arr.add(a[i]);
                }
                i++;
            }
        }
        while(i<n) {
            if(arr.get(arr.size()-1) != a[i]) {
                arr.add(a[i]);
            }
            i++;
        }
        while(j<m) {
            if(arr.get(arr.size()-1) != b[j]) {
                arr.add(b[j]);
            }
            j++;
        }
        return arr;
    }
}
