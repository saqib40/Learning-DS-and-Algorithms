public class S9 {
    public static int maxElement(int[] arr) {
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            max=arr[i]>max?arr[i]:max;
        }
        return max;
    }
    public static int sum(int[] arr) {
        int ans = 0;
        for(int x: arr) {
            ans += x;
        }
        return ans;
    }
    public static int countStudents(int[] arr, int pages) {
        int students = 1;
        int pageStudents = 0;
        for(int x : arr) {
            if(pageStudents + x <= pages) {
                pageStudents += x;
            }
            else {
                students++;
                pageStudents = x;
            }
        }
        return students;
    }
    // brute force
    public static int findPages1(int[] arr, int k) {
        // code here
        if(arr.length<k) {
            return -1;
        }
        int low = maxElement(arr);
        int high = sum(arr);
        for(int i=low; i<=high; i++) {
            int studentsComputed = countStudents(arr, i);
            if(studentsComputed <= k) {
                return i;
            }
        }
        return -1;//dummy
    }
    public static int findPages2(int[] arr, int k) {
        // code here
        if(arr.length<k) {
            return -1;
        }
        int low = maxElement(arr);
        int high = sum(arr);
        while(low<=high) {
            int mid = low+(high-low)/2;
            int studentsComputed = countStudents(arr, mid);
            if(studentsComputed > k) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return low;
    }
}
