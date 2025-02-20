public class S8 {
    // method 1 => using extra space
    // method 2
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1;
        int right = 0;
        while(left >= 0 && right<n) {
            if(nums1[left] > nums2[right]) {
                //swap
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        // put the nums2 into nums1
        int k = 0;
        for(int i=m; i<nums1.length; i++) {
            nums1[i] = nums2[k];
            k++;
        }
    }
    // method 3
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        // merge them initially into nums1
        int k=0;
        for(int i=m; i<nums1.length; i++) {
            nums1[i] = nums2[k];
            k++;
        }
        // then shell sort the nums1
        int gap = nums1.length/2 + nums1.length%2;
        while(gap>0) {
            int left = 0;
            int right = gap;
            while(right<nums1.length) {
                // swap if greater
                if(nums1[left] > nums1[right]) {
                    int temp = nums1[left];
                    nums1[left] = nums1[right];
                    nums1[right] = temp;
                }
                left++;
                right++;
            }
            if(gap == 1) break;
            gap = gap/2 + gap%2;
        }
    }
}
