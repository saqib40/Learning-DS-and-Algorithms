import java.util.Arrays;
import java.util.Collections;

public class S2 {
    // method 1 using array
    public String reverseWords1(String s) {
        String[] myArr = s.trim().split("\\s+");
        int n = myArr.length;
        Collections.reverse(Arrays.asList(myArr));
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<n; i++) {
            if(i!=n-1) {
                ans.append(myArr[i]);
                ans.append(" ");
            }
            else {
                ans.append(myArr[i]);
            }
        }
        return ans.toString();
    }
    // method 2 using stack easy (push into stack then pop out)
    // method 3 using StringBuilder
    public String reverseWords3(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int low = 0;
        int high = s.length()-1;
        while(low<=high) {
            char ch = s.charAt(low);
            if(ch != ' ') {
                temp.append(ch);
            }
            else {
                    if(ans.length() > 0) {
                        ans.insert(0, temp.toString() + " "); // prepend using insert
                    }
                    else {
                        ans.append(temp);
                    }
                    temp.setLength(0);
            }
            low++;
        }
        // add the last word if any
        if (temp.length() > 0) {
            if (ans.length() > 0) {
                ans.insert(0, temp.toString() + " ");
                
            }
            else {
                ans.append(temp);
            }
        }
        return ans.toString();
    }
}
