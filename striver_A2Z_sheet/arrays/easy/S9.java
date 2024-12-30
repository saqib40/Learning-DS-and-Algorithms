import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class S9 {
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
    public static ArrayList<Integer> findUnion2(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0; // to n
        int j = 0; // to m
        while(i<n && j<m) {
            if(arr1[i] == arr2[j]) {
                if(arr.size() == 0 || arr.get(arr.size()-1) != arr1[i]) { // to avoid duplication
                    arr.add(arr1[i]);
                    i++;
                    j++;
                }
                continue;
            }
            if(arr1[i] > arr2[j]) {
                if(arr.size() == 0 || arr.get(arr.size()-1) != arr2[j]) {
                    arr.add(arr2[j]);
                    j++;
                }
                continue;
            }
            if(arr1[i] < arr2[j]) {
                if(arr.size() == 0 || arr.get(arr.size()-1) != arr1[i]) {
                    arr.add(arr1[i]);
                    i++;
                }
                continue;
            }
        }
        while(i<n) {
            if(arr.get(arr.size()-1) != arr1[i]) {
                arr.add(arr1[i]);
                i++;
            }
        }
        while(j<m) {
            if(arr.get(arr.size()-1) != arr2[j]) {
                arr.add(arr2[j]);
                j++;
            }
        }
        return arr;
    }
}
