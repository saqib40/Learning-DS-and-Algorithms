import java.util.Arrays;

public class reverseWords {
    // e.g
    // ['t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e']
    // ['b','l','u','e',' ','i','s',' ','s','k','y',' ','t','h','e']
    public static void reverse(char[] arr, int start, int end) {
        while(start<=end) {
            char temp =  arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void reverseWords(char[] s) {
        int n = s.length;
        int low = 0;
        int high;
        // reverse the entire character array
        reverse(s, 0, n-1);
        // reverse each word of character array
        for(int i=0; i<n; i++) {
            if(s[i] == ' ') {
                high = i-1;
                reverse(s, low, high);
                low = i+1;
            }
        }
        reverse(s, low, n-1);
    }
    public static void main(String[] args) {
        char[] arr = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        reverseWords(arr);
        System.out.println(Arrays.toString(arr));
    }
}
