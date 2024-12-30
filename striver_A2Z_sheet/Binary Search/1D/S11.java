import java.util.List;

public class S11 {
    // number of rotations is equal to the index of smallest number
    public int findKRotation(List<Integer> arr) {
        int answer = 0;
        int n = arr.size();
        int low = 0;
        int high = n-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(arr.get(low)<=arr.get(high)) {
                answer = low;
                break;
            }
            int next = (mid+1)%n;
            int prev = (mid-1)%n;
            if(arr.get(mid) <= arr.get(next) && arr.get(mid) <= arr.get(prev)) {
                answer = mid;
                break;
            }
            if(arr.get(mid)<=arr.get(high)) {
                high = mid-1;
            }
            if(arr.get(mid)>=arr.get(low)) {
                low = mid+1;
            }
        }
        return answer;
    }
}
